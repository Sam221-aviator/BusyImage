# BusyImage

BusyImage is a simple Bash Linux distro that you can even run if you don't want to change your computer's system. In this Linux Distro, everything is from Middle Level user experience and it will boot into your `/bin/sh`. It uses a custom bootloader like Syslinux. The custom bootloader name is SYSLINUX BASH version. It was made by Sam(me).

## BOOTLOADER

if you type this command in your terminal,

```bash
./boot
```

it will pop up some texts like this.

```bash
SYSLINUX BASH BOOTLOADER v0.1

Type the path to the init program to boot.

boot:
```
 If you have the full experience, you have to type to the path of the init file.

 ``bash
 boot: ./init
 ``

 ## BusyImage boot

After you type `boot: ./init` in the boot file, you will see this.
```bash
<================BusyImage==============>
1. root
2. Add a user
: 
```

You can use the root user which can be the main user. Or you can use make one by choosing the choice 2. Or you can just go into usr, and make a new folder and edit the init file.

## BusyImage shell
After logging in to your user, you see a prompt like `$` or sometimes can be `#` based on your system. By typing `ls`, you can see your entire directory. You can run applications inside a folder called `sbin`. This folder contains the apps that the operating system has already added or maybe like minesweeper. You can also make one in the folder.

⚠️ DO NOT DELETE THE FOLDERS/FILES THAT ARE OUTSIDE YOUR USR FOLDER. THERE ARE SOME FOLDERS THAT WONT SUPPORT YOU FROM RUNNING THE OPERATING SYSTEM. 1. sbin: This folder is also outside of your usr folder. If you delete it, you cannot run any apps that are on BusyImage operating system on your main system. 2. usr: This is an important folder that manages your files. 3. init: This file is for your operating's main shell. If you run `./boot` in your terminal and try to type your init file path, it won't boot again.

If you want more features, email us at mmbk88221@gmail.com
