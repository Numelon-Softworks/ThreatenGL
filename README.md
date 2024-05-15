<!-- GitHub NOTE -->
> [!NOTE]
>
> 🚨 **Attention to Detail**
>
> Developers, please take note of the intentional use of wording and typography throughout this README. Bold words, italics, and other formatting elements are strategically employed to emphasise key points and nuances. Paying attention to these details can provide deeper insights into the intentions and objectives behind ThreatenGL... and to prevent heated discussions and arguments about the efficacy of this mod. Please don't start screaming; it's being actively discussed in ***many*** different channels. Dive in, and explore with a discerning eye! 👀✨

# 🤬 ThreatenGL
A Minecraft Fabric, Quilt, Forge and NeoForge mod that ***threatens*** Minecraft's OpenGL to utilise version 4.6 instead of stinky, outdated 3.2, potentially enhancing performance and leveraging modern graphics capabilities.

> Minecraft: please... I'll do anything! 😰
>
> ThreatenGL: use version 4.6... or else..! 😡🔪

## 🤨 Purpose of this mod
ThreatenGL aims to explore the ***potential*** performance benefits of encouraging Minecraft to use OpenGL 4.6 instead of 3.2. While traditional wisdom may suggest that OpenGL versions are merely indicative of GPU capabilities (and I do agree), users have reported tangible performance improvements with ThreatenGL.

<!-- TODO -->
<!--Please do not kill me if something is wrong here. If you know that I have said something *wrong(ish)* below then please check the more in-depth paper exploring Minecraft, OpenGL and its versions, GPU manufacturers, etc [here](./ignore-git/paper-toupload.md). -->

The primary objectives of ThreatenGL include:
- **Performance Enhancements**: By encouraging the use of OpenGL 4.6, ThreatenGL *seeks* to unlock potential performance gains that may otherwise be inaccessible with older OpenGL versions. Users have observed and reported improved frame rates and stability, particularly on newer hardware.

- **Compatibility and Optimisation**: While OpenGL versions are traditionally viewed as hints rather than strict requirements for graphical capabilities, ThreatenGL acknowledges the *potential* for compatibility issues and suboptimal performance arising from OpenGL 3.2. By *nudging* Minecraft towards OpenGL 4.6, the mod aims to ***explore*** whether such encouragement can lead to measurable improvements in gameplay experiences across a wider range of hardware.

## ⚙️ How does it work?
ThreatenGL operates by leveraging the power of "mixins" to inject code into Minecraft's `Window` class, which is responsible for creating the game window and its OpenGL context.

This injected code intercepts the `glfwWindowHint` method of the GLFW library used by Minecraft to set various hints for the OpenGL context, such as the version to use.

When the `glfwWindowHint` method is called by Minecraft, this mod checks whether the OpenGL version is being set. If so, then we manually override this version to be set to 4.6.

## 📥 Installing the Mod (Please read if you're using Quilt or Forge)
- If you are using Quilt, you will have to [install the Quilted Fabric API (QFAPI)](https://modrinth.com/mod/qsl).
- If you are using Forge, you will have to [install the Architectury API for Forge](https://modrinth.com/mod/architectury-api).

Fabric and NeoForge work without any additional dependencies!

## ❗Notes
This mod has undergone extensive testing to ensure that it is stable and won't explode your device. There are no issues so far, however, it is important to note that this is an experiment, as we are threatening Minecraft to use an OpenGL version that it is clearly not meant to run. ~~Mojang has their reasons for still using OpenGL 3.2, even in Minecraft 1.21 in 2024, but I don't really agree with them (mainly because I'm unaffected by the lack of backwards compatibility with newer OpenGL versions)~~

That being said, please report any issues with your logs, the mods and resource packs you are using, etc attached to the issue, and I will take a look at it. There may not be much that I can do though because this mod is very simple, it only changes the OpenGL version and absolutely nothing else. Plus, I develop plugins for Minecraft servers and not mods for Minecraft clients so my knowledge is partially limited, although I am willing to learn. :)

## ℹ️ Other Information & For those interested in the source code
This mod uses [Semantic Versioning 2.0.0](https://semver.org) to differentiate between different mod iterations.

Before modifying the source code and trying to compile, please edit the `gradle.properties` file and modify the following line:

**From:**
```properties
org.gradle.jvmargs=-Xmx8G
```

**To:**
```properties
org.gradle.jvmargs=-Xmx2G
```

This will reduce the amount of memory (RAM) given to Gradle, and is a highly recommended step for development if your device has less than 12GB of memory.

The only reason this is initially set to `8G` in the repository is because this mod is compiled on a device with higher resource availability.

Happy tinkering! 🔨