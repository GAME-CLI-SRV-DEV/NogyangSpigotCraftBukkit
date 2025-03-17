echo off
cls
echo Commencing NogyangSpigotCraftBukkit Git Submodules EMERGENCY RESET!
git submodule deinit -f work/Paper
git rm -f work/Paper
rd work/Paper
set /p branch=Branch:
git submodule add -b %branch% https://github.com/GAME-CLI-SRV-DEV/PaperSpigot.git work/Paper
git add .
git commit -m "switched submodule branch to %branch%"
git push origin main

