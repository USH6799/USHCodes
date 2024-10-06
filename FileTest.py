import os

def IsAvailable(path):
    try:
        open(path , 'r')
        
    except:
        print(path , " Not found")
        
def CheckComment(path , symbol):
    try:
        data = open(path , 'r').read()
        
        if(data.count(symbol) < 10):
            print(path , " Not commented")
        
        else:
            pass
        
    except:
        print(path , " Not found and Not commented")

    

def GetAllFiles(path , ext , passdata):
    data = os.listdir(path)
    for file in data:
        if file.endswith(ext):
            passdata.append(file)
        
        elif file.count('.'):
            if file.count("vscode") == 1:
                continue
            
            else:
                print(file + " Containing dot")
            
        else:
            passdata = GetAllFiles((f"{path}/{file}") , ext , passdata)
    
    return passdata


def IsPosted(loc , web):
    # print(loc)
    for pgm in loc:
        ans = web.count(pgm)
        if not ans:
            print(pgm + " Not Found on Web")
            pass
    
            
    
        
def Initiate(arr , ext , symbol , local):
    
    onlinedata = []
    
    while True:
        
        start = arr.find("assets")
        
        end = arr.find(ext) + len(ext)
        
        if(start == -1 or end == -1):
            break
        
        path = arr[start : end]

        
        arr = arr[end : ]
        
        onlinedata.append(path.split('/')[-1])
        IsAvailable(path)
        CheckComment(path , symbol)
        
    IsPosted(local , onlinedata)
          


if __name__ == "__main__":
            
    java = open('JAVA.html' , 'r').read().split('<main class="content">')[1].split('<div class="note">')[0]
    python = open('PYTHON.html' , 'r').read().split('<main class="content">')[1].split('<div class="note">')[0]

    java = java.strip()
    python = python.strip()

    local_java = GetAllFiles("./assets/Codes/JavaCode" , '.java' , [])
    
    local_python = GetAllFiles("./assets/Codes/PythonCode" , '.py' , [])

    Initiate(java , ".java" , "//" , local_java)
    
    # print(local_java)

    Initiate(python , ".py" , "#" , local_python)

    # print(local_python)
    




        




        