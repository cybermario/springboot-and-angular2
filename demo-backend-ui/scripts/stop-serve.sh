ps ax | grep -i 'start-serve' | grep -v grep | awk '{print $1}' | xargs kill -SIGTERM
