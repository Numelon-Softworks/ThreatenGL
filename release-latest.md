# 🎉 ThreatenGL v2.0.4 - backlog be gone!

After another long period of inactivity due to being busy, I am excited to announce a major refresh and rebase of ThreatenGL. This update tackles the huge backlog of issues that were posted on GitHub, moderninses the codebase and fixes mod compatibility issues hopefully once and for all!

## 🏠 GitHub repository change!!!
The GitHub repository has now moved to [`Richy-Z/ThreatenGL`](https://github.com/Richy-Z/ThreatenGL). This should not affect users of the mod or listings on Modrinth or Curseforge.

If you have the source code cloned using git, please remember to update the location of the remotes.

## 🤔 What's new?

- Full support has been confirmed so far up to version 1.21.8
    - Yes, this even includes NeoForge support, working from 1.20.2 all the way up to the latest version, which is 1.21.8 as of now!
- NeoForge 1.20.1 is no longer supported - this version was basically Forge and rarely used. Additionally it bloated the `mods.toml` configuration with us having to support version maven versions `[40,)` (old NeoForge versioning scheme)
- Early Loading Screen (and similar mods) have been identified as incompatible with ThreatenGL. There is now also an [incompatibility list](https://github.com/Richy-Z/ThreatenGL?tab=readme-ov-file#incompatibility-with-other-mods) on the README in the GitHub.
- Internal package paths have been renamed to `lol.richy.*`, reflecting true ownership of the mod after we recently had some organisational changes.

### 🐞 Bug Fixes

- NeoForge users should no longer encounter "invalid mod file" errors. This was due to conflicting `mods.toml` and `neoforge.mods.toml` behaviour, which have now been resolved.

### 👻  *"Invisible Changes"*

The changes below are changes made to the source repository that should not normally affect your gameplay or usage of the mod. This information is aimed more towards developers who want to look at the source repository:

- Some portions of the source code have been reorganised or rewritten for clarity, however this should not affect the results you receive from the mod.
- The Architectury API is no longer required, it is now only used as a gradle base for cross-loader compatibility in the entire project.
- Switched to a modern gradle wrapper verification action, since the old one has been deprecated.
- The build pipeline has been modified a bit
- The repository has been made ready to transfer to `Richy-Z/ThreatenGL` (keep in mind that this announcement is likely being posted before the transfer happens)
- READMEs and descriptions have been cleaned up a bit. The GitHub README is now closer to the Modrinth README for consistency and to remove some bloat.

### 📌 Resolved GitHub issues

- [#27](https://github.com/Richy-Z/ThreatenGL/issues/27): A mod incompatibility list has now been created.
- [#18](https://github.com/Richy-Z/ThreatenGL/issues/18): NeoForge 1.20.1 support has been dropped.
- [#22](https://github.com/Richy-Z/ThreatenGL/issues/22): 1.21.4 is properly supported.
- [#24](https://github.com/Richy-Z/ThreatenGL/issues/24): NeoForge compatibility issues have been fixed for all versions.
- [#28](https://github.com/Richy-Z/ThreatenGL/issues/28): 1.21.7 is now supported.
- [#29](https://github.com/Richy-Z/ThreatenGL/issues/29): 1.21.6 is now supported.
- [#31](https://github.com/Richy-Z/ThreatenGL/issues/31): 1.21.8 is now supported.

Thanks to the amazing community who reported these issues promptly! 💖
> And again, an apology from me for being so slow to respond to them.

----------

**Since 1.3.2-beta.1, ThreatenGL no longer requires any additional libraries to work! This reduces mod conflicts and incompatibilities.**

## 💃 psst... join the community <3

Interested in other grand projects or updates for this mod? [Join my Discord server](https://discord.gg/eYEDsnKh2T) for sneak peeks, discussions, and exciting announcements, and to interact with the vibrant and kind community!

## What's Changed
* Version 2.0.4 by @Richy-Z in https://github.com/Richy-Z/ThreatenGL/pull/32
* **Full Changelog**: https://github.com/Richy-Z/ThreatenGL/compare/1.3.3-release.1...2.0.4-release.9