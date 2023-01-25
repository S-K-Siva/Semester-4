#! /bin/bash

count=10


# Let's see some syntax used for comparisions for integers and strings in shell

# INTEGER COMPARISIONS

# -> -eq = is equal to - if [ "$a" -eq "$b" ]
# -> -ne = is not equal to - if [ "$a" -ne "$b" ]
# -> -gt = is greater than - if [ "$a" -gt "$b" ]
# -> -ge = is greater than or equal to - if [ "$a" -ge "$b" ]
# -> -lt = is less than - if [ "$a" -lt "$b" ]
# -> -le = is less than or equal to - if [ "$a" -le "$b" ]
# -> < = is less than - (("$a" < "$b"))
# -> <= = is less than or equal to - (("$a" <= "$b"))
# -> > = is greater than - (("$a" > "$b"))
# -> >= = is greater than or equal to - (("$a" >= "$b"))

# STRING COMPARISIONS

# -> = - is equal to - if [ "$a" = "$b" ] 
# -> == - is equal to - if [ "$a" == "$b" ] 
# -> != - is not equal to - if [ "$a" != "$b" ]
# -> < - is less than, in ASCII alphabetical order - if [[ "$a" < "$b" ]]
# -> > - is greater than, in ASCII alphabetical order - if [[ "$a" > "$b" ]]
# -> -z - string is null, that is, has zero length.

# fi --> END OF THE 'IF' STATEMENT.

if [ $count -eq 10 ]
then
 echo "The value is 10"
fi

if [ $count -ne 9 ]
then
 echo "The value is not equal to 9"
fi

if [ $count -gt 10 ]
then 
 echo "The value is greater than 10"
else 
 echo "The value is not greater than 10"
fi

if [ $count -ge 10 ]
then
 echo "The value is greater than or equal to 10"
else 
 echo "The value is not greater than or equal to 10"
fi

if [ $count -lt 10 ]
then 
 echo "The value is lesser than 10"
else 
 echo "The value is not lesser than 10"
fi

if [ $count -le 10 ]
then 
 echo "The value is lesser than or equal to 10"
else
 echo "The value is not lesser than or equal to 10"
fi

# if we use symbol comparision we need to use two parenthesis on both sides!

if (( $count == 10 ))
then
 echo "The number is equal to 10"
else
 echo "The number is not equal to 10"
fi

if (( $count >= 10 ))
then
 echo "The number is greater than or equal to 10"
else
 echo "The number is not greater than or equal to 10"
fi


echo "STRING OPERATIONS......"
# STRING COMPARISIONS EXAMPLE
string="a"
if [ $string = 'a' ]
then
 echo "The string is 'a'"
else 
 echo "The string is 'b'"
fi


# if we going to use '>' or '<' symbol, like integer comparisions we need to use double square brackets '[[ ]]' instead of '(( ))'

if [[ $string > 'b' ]]
then 
 echo "The string 'a' is greater than 'b'"
else
 echo "The string 'a' is not greater than 'b'"
fi


# like programming language, in shell scripting we have if, if..else, if..elif..else

# Let's see some examples...

if [[ $string == 'w' ]]
then 
 echo "The string is 'w'"
elif [[ $string == 'a' ]]
then 
 echo "The string is 'a'"
else
 echo "The string is something not recognizable"
fi

# The above set of code is example of if..elif..else.

