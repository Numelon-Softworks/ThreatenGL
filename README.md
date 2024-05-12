# 🤬 ThreatenGL
A Minecraft Fabric mod that ***threatens*** OpenGL to use version 4.6 instead of stinky, outdated 3.2 (or any OpenGL version).

> Minecraft: please.. i'll do anything! 😰
>
> ThreatenGL: use version 4.6... or else..! 😡🔪

## 🤨 Why?
ThreatenGL exists for many reasons, but here are the most important ones:
- **Graphics Evolution**: OpenGL 3.2, the version of OpenGL that Minecraft still uses to this day, is ***ancient*** by today's standards. It was released on August 11, 2008 - a time when the graphics capabilities of devices were significantly less advanced than what we have today. OpenGL 3.2 is 16 years old, and can now legally drive and have children!

- **MASSIVE Performance Bost**: One of the most compelling reasons for this mod's existence is the significant performance improvements it can bring, especially on newer devices. I recently decided to switch to Linux again and noticed that my frame rates were **DOUBLE** of that on Windows, even with ray-traced shaders, 30 fabric mods and 5 resource packs enabled. Then I also noticed that my OpenGL version was 4.6 and not 3.2 like on Windows. The mod aims to bridge this gap by forcing Minecraft to use a more modern version of OpenGL, allowing it to leverage the full potential of your hardware.

- **Compatibility and Optimisation**: OpenGL was developed ***a long time*** before many of the powerful graphics cards available today were even created or thought of. As a result, these graphics cards were not optimised for OpenGL 3.2, leading to suboptimal performance. By forcing the use of OpenGL 4.6, ThreatenGL ensures that Minecraft can take advantage of the optimisations and features provided by more recent graphics cards.

- **Future-Proofing**: This mod isn't just about improving the current experience; it's also about future-proofing Minecraft. As technology continues to advance, the demand for better graphics such as shaders and performance will only increase. By ensuring that Minecraft uses a more modern version of OpenGL, ThreatenGL helps keep the game fresh and fun for everyone, especially those who love to push the boundaries with the latest hardware. (like me, for example)
    - Imagine if shader creators had to entirely ditch some features because the game was running slow, thinking it was their shaders that were the problem, when in reality it was actually just an outdated OpenGL version being incredibly slow. That is a lot of missed opportunities!

## ⚙️ How does it work?
ThreatenGL operates by leveraging the power of "mixins" to inject code into Minecraft's `Window` class, which is responsible for creating the game window and its OpenGL context.

This injected code intercepts the `glfwWindowHint` method of the GLFW library used by Minecraft to set various hints for the OpenGL context, such as the version to use.

When the `glfwWindowHint` method is called by Minecraft, this mod checks whether the OpenGL version is being set. If so, then we manually override this version to be set to 4.6.

# ❗Issues
This mod has undergone extensive testing and I have verified the claims made previously. There are no issues so far, however, it is important to note that this is kinda an experiment, as we are threatening Minecraft to use an OpenGL version that it is clearly not meant to run. No one knows why Mojang still uses OpenGL 3.2 even in Minecraft 1.20.6, but I'm sure that they have their own reasons for it (which I don't agree with, hence the creation of this project).

That being said, please report any issues with your logs, the mods and resource packs you are using, etc attached to the issue, and I will take a look at it. There may not be much that I can do though because this mod is very simple, it only changes the OpenGL version and absolutely nothing else. Plus, I develop plugins for Minecraft servers and not mods for Minecraft clients so my knowledge is partially limited, although I am willing to learn.
