# 🗽 ThreatenGL 1.3.2 (Beta 1)

----------
## 🫶 A large "Thank You" to everyone! <3
As the milestone of 2000 downloads is approached, I want to extend a heartfelt thank you to each and every one of you. Your support means the world to me - seeing all these downloads, the 55 followers, and the 7 stars on the GitHub repository is incredibly motivating. I'm also grateful for the additional followers on both the GitHub organisation and my personal profile. The growth of our vibrant community on Discord, now 50 members strong, has been truly inspiring. Your enthusiasm and feedback (especially from experienced developers) have been incredibly invaluable.

These past 10 days since the inception of ThreatenGL have been.. sort of a whirlwind of emotions, challenges and triumphs. 😵‍💫 From the initial concept to overcoming various hurdles, your responses and engagement have been phenomenal, and I would especially like to extend my thank you to those who have been reporting issues with the mod on GitHub - those who have gone out of their way to take time out of their day to make the experience better for everyone. 🪛

Significant strides have been made, yet this is only the beginning... 👀 There is a bright future ahead for ThreatenGL, with many exciting features and improvements on the horizon. Here's a small hint for the curious: beyond simply forcing the OpenGL version among other *(slightly insignificant)* things, I'm planning to introduce actual optimisations and grander features to enhance your Minecraft experience even further. So stay tuned, and [join the Discord](https://discord.gg/eYEDsnKh2T) for sneak peeks and to be part of this warm, vibrant growing community! 🗣️

Thanks once again for your unwavering support! 💖

-- Richy

----------

### A large majority of the code for this mod has been modified in order to make it self sufficient: dependencies have been reduced so that ***Quilt and Forge no longer require QSL/QFAPI or the Architectury API respectively!*** 🥳🗽

- Fabric and NeoForge, which used to work *without* the Architectury API before 1.3.1-beta.1, suddenly started crashing without it installed: [Full explanation on GitHub](https://github.com/Numelon-Softworks/ThreatenGL/issues/10#issuecomment-2120624064). To address this issue, client/server checking (Introduced through [this issue](https://github.com/Numelon-Softworks/ThreatenGL/issues/8)) has been removed from common code and implemented on a per-platform basis instead. ( https://github.com/Numelon-Softworks/ThreatenGL/issues/10 )

- Running this mod on Quilt no longer requires the QFAPI/QSL library, and running the mod on Forge no longer requires the Architectury API! This increases mod compatibility and reduces the possibility of mod conflicts. 🗣️ ( https://github.com/Numelon-Softworks/ThreatenGL/issues/9 )

Thanks to the amazing community who reported these issues promptly! 💖

----------

**Since 1.3.2-beta.1, ThreatenGL no longer requires any additional libraries to work! 🥳**

#### 🤫 psst.. something new might be coming soon
New features for ThreatenGL are being actively worked on. [Join the Discord](https://discord.gg/eYEDsnKh2T) to receive sneak peeks and interact with the vibrant community! 😊