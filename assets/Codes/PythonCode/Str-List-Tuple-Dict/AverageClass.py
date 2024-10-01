def AddSubject(data , s):
    if(s == 'q'):
        print("*******************************************\n")
        return False
    
    else:
        data[s] = []
        return True
    
def AddMarks(data):
    i = 1
    limit = int(input("Enter the Total no. Of Students: "))

    while i <= limit:
        
        for key in data:
            print("----------------------------------------------")
            mk = int(input(f"Enter the Marks of Student {i} in {key} Subject: "))
            data[key].append(mk)
        
        i += 1
        
    return data


def Calc(data , i):
    if(i >= len(list(data.values())[0])):
        return
    
    sum = 0
    
    
    for key in data:
        sum += data[key][i]
        total = len(data) * 100
        
    print("\n:::::::::::::::::::::::::::::::::::::::::::::::")
    print(f"Student {i + 1} Got {sum}/{total} & Creating {(round(((sum / total) * 100) , 1))}%")
    
    Calc(data , i + 1)
        
    
if __name__ == "__main__":
    group = {}    
    flag = True
    Entry = True
    
    while flag:
        sub = input("Enter the Name of the Subject or Enter q When Done: ")
        flag = AddSubject(group , sub)

    group = AddMarks(group)
    Calc(group , 0)
        
    
        
