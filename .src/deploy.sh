#!/bin/bash
PWD=`pwd`
SRC=~/dev/zarudama.com
DST=/var/www
OPT=crpgvz
rsync() {
    local opt=$1
    sudo rsync --exclude-from=exclude.txt --delete -$opt $SRC/ $DST
}
preview() {
    rsync n$OPT
}
deploy() {
    rsync $OPT
}
preview
echo "deploy?(y/n)"
read key
case "$key" in
"y" ) deploy ;;
esac
cd $PWD

