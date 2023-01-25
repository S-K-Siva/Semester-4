#! /bin/bash

# FILE TEST OPERATIONS/OPERATORS
# \c - is used to get the input in same line
# -e - it is a flag which helps to keep the cursor on '\c'


echo -e "Enter the name of the file :\c"
read file_name
# -e $file_name - is used to check whether file exist or not.
# -e - is to check whether file exist or not
# -f - checks whether the file exist and it's regular file.
# -d - checks whether the directory exist or not
if [ -e $file_name ] 
then 
 echo "$file_name found"
else
 echo "$file_name not found"
fi
echo -e "Enter the name of the file :\c"
read new_file
if [ -f $new_file ]
then
 echo "The file exist and it's regular file"
else
 echo "The file is not a regular file and mayn't exist"
fi

echo -e "Enter the directory name:\c"
read directory_name
if [ -d $directory_name ] 
then 
 echo "The directory exist."
else
 echo "The directory doesn't exist."
fi


# There are two types of file
# 1. Block special file [-b]
# 2. Character special file [-c]

# -s = It is a flag which tells whether the file is empty or not.

echo "LET'S CHECK WHETHER THE FILE IS EMPTY OR NOT!."
echo -e "Enter the file name:\c"
read file

if [ -s $file ]
then
 echo "The file is not empty"
else
 echo "The file is empty"
fi

# There are some flags used below to check whether the file has some permissions.

# -x = whether the file is executable or not
# -r = whether the file is readable or not
# -w = whether the file is writable or not

echo "EXECUTABLE FILE CHECKER"
echo -e "Enter the file name :\c"
read exe_file
if [[ -x exe_file ]]
then 
 echo "The $exe_file is  executable"
else
 echo "The $exe_file is not executable"
fi

echo "READABLE FILE CHECKER"
echo -e "Enter the file name:\c"
read read_file
if [[ -r read_file ]]
then 
 echo "The $read_file is not readable"
else
 echo "The $read_file is readable"
fi

echo "WRITABLE FILE CHECKER"
echo -e "Enter the file name:\c"
read write_file
if [[ -w write_file ]]
then 
 echo "The $write_file is not writable"
else
 echo "The $write_file is writable"
fi

