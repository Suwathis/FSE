#!/bin/bash

# Project Setup
mkdir GitLabHandsOn
cd GitLabHandsOn
git init

# Log File Ignore Task
mkdir log
touch test.log
echo "*.log" >> .gitignore
echo "log/" >> .gitignore
git add .gitignore
git commit -m "Add .gitignore to ignore .log files and log folder"
git status

# Branching Hands-on
git checkout -b GitNewBranch
git branch -a
echo "Some content" > branchfile.txt
git add branchfile.txt
git commit -m "Added branchfile.txt in GitNewBranch"
git status

# Merging Hands-on
git checkout master
git diff GitNewBranch
git difftool master GitNewBranch || echo "Use P4Merge if configured"
git merge GitNewBranch
git log --oneline --graph --decorate
git branch -d GitNewBranch
git status

# Conflict Hands-on
git status
git checkout -b GitWork
echo "Line A" > hello.xml
git add hello.xml
git commit -m "Add hello.xml in GitWork"
echo "Line B" >> hello.xml
git add hello.xml
git commit -m "Update hello.xml in GitWork"
git checkout master
echo "Different Line" > hello.xml
git add hello.xml
git commit -m "Add hello.xml in master"
git log --oneline --graph --decorate --all
git diff GitWork
git difftool master GitWork || echo "Use P4Merge if configured"
git merge GitWork || echo "Resolve conflicts manually if prompted"
# After manual resolution
git add hello.xml
git commit -m "Merge GitWork with conflict resolved"
echo "*~" >> .gitignore
git add .gitignore
git commit -m "Ignore backup files"
git branch -d GitWork
git log --oneline --graph --decorate

# Remote Repository Hands-on
git status
git branch -a
git pull origin master
git push origin master