#!/bin/sh

clear
echo "SYSLINUX BASH BOOTLOADER v0.1"
echo
echo "Type the path to the init program to boot."
echo

while true; do
    printf "boot: "
    read BOOTCMD

    if [ -n "$BOOTCMD" ]; then
        if [ -f "$BOOTCMD" ] && [ -x "$BOOTCMD" ]; then
            echo "Booting into $BOOTCMD..."
            sleep 1
            exec "$BOOTCMD"
        else
            echo "Error: '$BOOTCMD' not found or not executable."
        fi
    fi
done
