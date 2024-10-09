import os

def getAllLinks(data , ext):
    links = []
    
    while True:
        
        start = data.find("assets")
        
        if start == -1:
            
            break
        
        end = data.find(ext)
        
        end += len(ext)
        
        links.append(data[start : end])
        
        data = data[end : ]
        
    return links

def isCommented(code , comment):
    
    data = open(code , 'r' , -1 , 'UTF-8').read()
    
    if(data.count(comment) < 10):
        
        print(code + " is Not Commented.")
        

def isLocalPresent(links , ext):
    
    for link in links:
        
        try:
            
            open(link , 'r' , -1 , 'UTF-8')
            
            isCommented(link , ext)
            
        except:
            
            print(link , ' is On Website But Not Present Locally.')
            
def isOnlinePresent(online , local):
    for file in local:
        flag = False
        for data in online:
            
            if(file in data):
                flag = True

        if(not flag):
            print(file , " is not Present Online")


def extractLocalFiles(folder_path , ext):
    data_files = [] 
    
    for root, dirs, files in os.walk(folder_path):
        
        for file in files:
            
            if file.endswith(ext): 
                
                data_files.append(root + "/" + file)
                
            elif (file.count(".") >= 1):
                print(file + " contains Dot.")
                

    return data_files


    
    

if __name__ == "__main__":
            
    java_online = open('JAVA.html' , 'r').read().split('<main class="content">')[1].split('<div class="note">')[0]

    python_online = open('PYTHON.html' , 'r').read().split('<main class="content">')[1].split('<div class="note">')[0]
    
    java_local = extractLocalFiles("assets/Codes/JavaCode/" , '.java')    

    python_local = extractLocalFiles("assets/Codes/PythonCode/" , '.py')    

    
    online_java_links = getAllLinks(java_online , ".java")

    online_python_links = getAllLinks(python_online , ".py")

    isOnlinePresent(online_java_links , java_local)

    isOnlinePresent(online_python_links , python_local)

    isLocalPresent(online_java_links , '//')

    isLocalPresent(online_python_links , '#')