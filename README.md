> **Archived, 2026-09-27.** This repository is archived. It holds historical Video Splitter 2.x source code from 2023, licensed under GPL-3.0. It is not the code of the app now on Google Play. Current versions of Video Splitter are published by Mikasa Labs LLC under the Terms and Conditions at https://mikasa-labs.com/VideoSplitter/terms.html and the Privacy Policy at https://mikasa-labs.com/VideoSplitter/privacy.html. Correction: the statement in this README that no user data is collected was inaccurate. The 2.x versions built from this code included Firebase Analytics and Firebase Crashlytics crash reporting, which sent usage and crash data to Google. See the current Privacy Policy for what the app does today. ## Drafting notes (not part of the paragraph) - Every statement traces to a recorded fact: 2.x code, 2023, GPL-3.0, firebase-analytics-ktx and firebase-crashlytics-ktx in the public build.gradle, and the README sentence "Completely free without any ads and no user data is collected" are recorded in review/2026-09-21-verification.md Finding F7 (owner-side facts read with gh on 2026-09-21; sources.md "Not verified" list). That 2.x sent usage and crash data to Google is the owner's own statement about code the owner wrote (owner input 5 of 2026-09-25) and is consistent with F7's reading of the build file; the paragraph does not say "by default" because the 2.x manifests were not read. - "Current versions ... published by Mikasa Labs LLC": true from the completion of the Google Play transfer (owner input 1 of 2026-09-25). Do NOT paste the paragraph before the two URLs return 200 (both were 404 on 2026-09-25); a link to a missing page would undercut the correction it carries. - The paragraph keeps the GPL-3.0 licence of the 2.x code untouched: it neither relicenses nor withdraws anything. Whether any GPL-licensed code by a third-party contributor survives in 3.x, and the proprietary licence posture of the Play build, remain counsel packet item 6 (docs/legal/counsel-packet.md). - Archiving on GitHub makes the repository read-only; the notice must be committed BEFORE the archive switch is flipped. - Sequence: pages live (on or before 2026-10-01) -> paste and commit the paragraph in both repositories -> archive both -> record the date in profile.md Section 1.4. Change log: 2026-09-25, first version, drafted from owner input 5 of 2026-09-25; owner sign-off recorded the same day.

# Video Splitter

#### Features:

- Completely free without any ads and no user data is collected.
- Split your videos seamlessly into 30 seconds or custom splits for WhatsApp* and other social media platforms.
- Split videos into custom duration clips according to your preference.
- Extract one clip from the video based on your desired start and end times.
- Manual mode to split videos at desired positions.
- Easy to select single or multiple videos from library and share them.
- Option to customize video and audio quality settings to fine tune either the file size or quality.
- Mesmerizing Dark and Light themes.

| ![30 Sec](https://user-images.githubusercontent.com/13308678/111888776-d36d6f00-899c-11eb-8965-bd21b73e8bce.png) | ![Custom](https://user-images.githubusercontent.com/13308678/111888777-d5373280-899c-11eb-92ee-9c2c363f5276.png) | ![Library](https://user-images.githubusercontent.com/13308678/111888778-d700f600-899c-11eb-9de7-8ee1b19eeb16.png) | ![Manual](https://user-images.githubusercontent.com/13308678/111888779-d7998c80-899c-11eb-8588-49fdc07fab00.png) |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![One](https://user-images.githubusercontent.com/13308678/111888782-d8cab980-899c-11eb-9ff3-6dbc140a9a5d.png) | ![Settings](https://user-images.githubusercontent.com/13308678/111888783-da947d00-899c-11eb-974f-7c39b05567fc.png) | ![Share](https://user-images.githubusercontent.com/13308678/111888784-db2d1380-899c-11eb-8871-86d4866e5358.png) | ![Theme](https://user-images.githubusercontent.com/13308678/111888786-dc5e4080-899c-11eb-8604-be76705b1b90.png) |

\* All product and company names are trademarks™ or registered® trademarks of their respective holders. Use of them does not imply any affiliation with or endorsement by them.

#### Download the App

[<img src="https://play.google.com/intl/en_us/badges/static/images/badges/en_badge_web_generic.png" alt="google-play-badge" width="33%" />](https://play.google.com/store/apps/details?id=io.github.videosplitterapp&pcampaignid=pcampaignidMKT-Other-global-all-co-prtnr-py-PartBadge-Mar2515-1)

Google Play and the Google Play logo are trademarks of Google LLC.