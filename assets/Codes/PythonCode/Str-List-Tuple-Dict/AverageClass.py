def AddSubject(data, s):
    # This function is used to add subjects to the 'data' dictionary.
    # 'data' is a dictionary that stores subjects and their respective marks for each student.
    # 's' is the subject name entered by the user.
    
    if s == 'q':
        # If the user enters 'q', it indicates that they have finished entering subjects.
        print("*******************************************\n")
        return False  # This stops further addition of subjects.
    
    else:
        # If the user enters a subject name, an empty list is created for that subject in the dictionary.
        # This list will later store marks for that subject.
        data[s] = []
        return True  # This allows the program to keep asking for more subjects until the user enters 'q'.
    
def AddMarks(data):
    # This function is used to add marks for each student for the subjects in the 'data' dictionary.

    i = 1  # Variable 'i' is used to keep track of the student number.
    limit = int(input("Enter the Total no. Of Students: "))
    # The 'limit' variable stores the total number of students, entered by the user.
    
    while i <= limit:
        # This loop runs once for each student until 'i' reaches 'limit'.

        for key in data:
            # For each subject in the dictionary, the user is prompted to enter marks for the current student.
            print("----------------------------------------------")
            mk = int(input(f"Enter the Marks of Student {i} in {key} Subject: "))
            # The 'mk' variable stores the marks entered by the user for the current subject.
            # The marks are appended to the subject's list in the dictionary.
            data[key].append(mk)
        
        i += 1  # Increment the student counter after marks are entered for all subjects.
        
    return data  # Return the updated dictionary with marks for each subject.

def Calc(data, i):
    # This function calculates the total and percentage of marks for each student.

    if i >= len(list(data.values())[0]):
        # If 'i' exceeds the number of students, the function stops.
        return
    
    sum = 0  # This variable will store the sum of marks for the current student.
    
    for key in data:
        # Iterate over each subject in the dictionary.
        sum += data[key][i]  # Add the marks of the current student in each subject.
        total = len(data) * 100  # Calculate the total possible marks (100 per subject).

    print("\n:::::::::::::::::::::::::::::::::::::::::::::::")
    print(f"Student {i + 1} Got {sum}/{total} & Creating {(round(((sum / total) * 100), 1))}%")
    # Display the total marks obtained by the student and their percentage.
    
    Calc(data, i + 1)  # Recursively call the function to calculate marks for the next student.

if __name__ == "__main__":
    # This is the starting point of the program.
    group = {}  # Initialize an empty dictionary to store subjects and marks.
    flag = True  # 'flag' is used to control the addition of subjects.
    Entry = True  # 'Entry' is an additional variable but not used in the program's logic.
    
    while flag:
        # Continuously prompt the user to add subjects until they enter 'q'.
        sub = input("Enter the Name of the Subject or Enter q When Done: ")
        flag = AddSubject(group, sub)

    group = AddMarks(group)  # Call the function to add marks for each student.
    Calc(group, 0)  # Call the function to calculate and display marks and percentages for each student.
