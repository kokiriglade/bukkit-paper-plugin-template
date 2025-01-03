# template

Template to easily create Bukkit plugins for [paper](https://github.com/PaperMC/Paper). It is pretty
heavily inspired by [Carbon](https://github.com/Hexaoxide/Carbon)'s project layout.
This template was made as a personal convenience; I don't have any interest in providing support for
usage, but PR's are welcome. :)

## Checkstyle

This template uses (a fork of) checkstyle to ensure code style is consistent across the entire project.  
For checkstyle support in IDEA:

1. Install the [checkstyle plugin](https://github.com/jshiell/checkstyle-idea).
2. Compile https://gitlab.com/stellardrift/stylecheck
3. `Settings` -> `Tools` -> `Checkstyle` `Third-Party Checks`, add the compiled stylecheck jar
4. While still in the `Checkstyle` tab, go to `Configuration File`, add `.checkstyle/checkstyle.xml`
   and tick the check-box.
