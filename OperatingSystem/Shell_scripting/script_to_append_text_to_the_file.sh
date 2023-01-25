#! /bin/bash

echo -e "Enter name of the file :\c"
read file

# cat > = The file will be overwritten
# cat >> = The file will be appended
if [ -f $file ]
then
	if [ -w $file ]
	then
		echo "Type Some Text Data. To quit press Ctrl+d."
		cat >> $file
	else
		echo "The file do  not have write permissions"
	fi
else
	echo "$file not exists"
fi
