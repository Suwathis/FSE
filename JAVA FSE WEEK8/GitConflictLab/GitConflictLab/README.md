# Git Conflict and Merge Hands-On

## Git Bash Commands

1. Verify if master is in clean state:
   git status

2. Create a branch “GitWork”:
   git checkout -b GitWork

3. Add a file “hello.xml”:
   echo "<message>Hello from GitWork branch</message>" > hello.xml

4. Update the content of “hello.xml” and observe the status:
   echo "<message>Updated content from GitWork</message>" > hello.xml
   git status

5. Commit the changes:
   git add hello.xml
   git commit -m "Added hello.xml in GitWork branch"

6. Switch to master:
   git checkout master

7. Add a file “hello.xml” with different content:
   echo "<message>Hello from Master branch</message>" > hello.xml

8. Commit the changes:
   git add hello.xml
   git commit -m "Added hello.xml in master with different content"

9. Observe the log:
   git log --oneline --graph --decorate --all

10. Check differences:
    git diff master GitWork

11. Use P4Merge for visual diff (configured beforehand):
    git mergetool

12. Merge the branch to master:
    git merge GitWork

13. Resolve conflict using 3-way merge tool:
    # Git will prompt for merge tool, use and save

14. Commit after resolving conflict:
    git add hello.xml
    git commit -m "Resolved conflict and merged GitWork into master"

15. Observe git status and ignore backup file:
    git status
    echo "*.bak" >> .gitignore

16. Commit .gitignore update:
    git add .gitignore
    git commit -m "Ignore backup files"

17. List all branches:
    git branch

18. Delete the merged branch:
    git branch -d GitWork

19. Final log observation:
    git log --oneline --graph --decorate
