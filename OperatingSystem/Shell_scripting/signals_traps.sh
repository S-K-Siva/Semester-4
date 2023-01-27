#!/bin/bash
# command to kill the process : kill -9 "$PID"
echo "$$"
# 0 -> SUCCESS_SIGNAL
# SIGKILL, SIGSTOP - It won't catch the signal.
# SIGINT - interrept the signal.
# SIGTERM - 15
trap "echo exit command is detected" SIGINT 
echo "Hello world"
while (( COUNT < 10 ))
do
	sleep 10
	(( COUNT ++ ))
	echo $COUNT
done
exit 0
