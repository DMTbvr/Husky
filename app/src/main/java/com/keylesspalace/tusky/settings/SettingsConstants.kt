package com.keylesspalace.tusky.settings

enum class AppTheme(val value: String) {
    NIGHT("night"),
    DAY("day"),
    BLACK("black"),
    AUTO("auto"),
    AUTO_SYSTEM("auto_system");

    companion object {
        fun stringValues() = values().map { it.value }.toTypedArray()
    }
}

object PrefKeys {
    // Note: not all of these keys are actually used as SharedPreferences keys but we must give
    // each preference a key for it to work.

    const val APP_THEME = "appTheme"
    const val EMOJI = "emojiCompat"
    const val FAB_HIDE = "fabHide"
    const val LANGUAGE = "language"
    const val STATUS_TEXT_SIZE = "statusTextSize"
    const val MAIN_NAV_POSITION = "mainNavPosition"
    const val ABSOLUTE_TIME_VIEW = "absoluteTimeView"
    const val SHOW_BOT_OVERLAY = "showBotOverlay"
    const val ANIMATE_GIF_AVATARS = "animateGifAvatars"
    const val USE_BLURHASH = "useBlurhash"
    const val SHOW_NOTIFICATIONS_FILTER = "showNotificationsFilter"
    const val SHOW_CARDS_IN_TIMELINES = "showCardsInTimelines"
    const val ENABLE_SWIPE_FOR_TABS = "enableSwipeForTabs"
    const val BIG_EMOJIS = "bigEmojis"
    const val STICKERS = "stickers"

    const val CUSTOM_TABS = "customTabs"

    const val HTTP_PROXY_ENABLED = "httpProxyEnabled"
    const val HTTP_PROXY_SERVER = "httpProxyServer"
    const val HTTP_PROXY_PORT = "httpProxyPort"

    const val DEFAULT_POST_PRIVACY = "defaultPostPrivacy"
    const val DEFAULT_MEDIA_SENSITIVITY = "defaultMediaSensitivity"
    const val DEFAULT_FORMATTING_SYNTAX = "defaultFormattingSyntax"
    const val MEDIA_PREVIEW_ENABLED = "mediaPreviewEnabled"
    const val ALWAYS_SHOW_SENSITIVE_MEDIA = "alwaysShowSensitiveMedia"
    const val ALWAYS_OPEN_SPOILER = "alwaysOpenSpoiler"

    const val NOTIFICATIONS_ENABLED = "notificationsEnabled"
    const val NOTIFICATION_ALERT_LIGHT = "notificationAlertLight"
    const val NOTIFICATION_ALERT_VIBRATE = "notificationAlertVibrate"
    const val NOTIFICATION_ALERT_SOUND = "notificationAlertSound"
    const val NOTIFICATION_FILTER_POLLS = "notificationFilterPolls"
    const val NOTIFICATION_FILTER_FAVS = "notificationFilterFavourites"
    const val NOTIFICATION_FILTER_REBLOGS = "notificationFilterReblogs"
    const val NOTIFICATION_FILTER_FOLLOW_REQUESTS = "notificationFilterFollowRequests"
    const val NOTIFICATION_FILTER_EMOJI_REACTIONS = "notificationFilterEmojis"
    const val NOTIFICATIONS_FILTER_FOLLOWS = "notificationFilterFollows"

    const val TAB_FILTER_HOME_REPLIES = "tabFilterHomeBoosts"
    const val TAB_FILTER_HOME_BOOSTS = "tabFilterHomeReplies"
}