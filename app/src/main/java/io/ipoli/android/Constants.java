package io.ipoli.android;

/**
 * Created by Venelin Valkov <venelin@curiousily.com>
 * on 6/15/15.
 */
public interface Constants {

    String API_DATETIME_ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    int EDIT_QUEST_RESULT_REQUEST_CODE = 11;
    int REMIND_START_QUEST_NOTIFICATION_ID = 103;

    int QUEST_TIMER_NOTIFICATION_ID = 201;

    int QUEST_DONE_NOTIFICATION_ID = 202;
    int DEFAULT_SNOOZE_TIME_MINUTES = 10;

    String DEFAULT_PLAYER_AVATAR = "avatar_07";

    int QUEST_WITH_NO_DURATION_TIMER_MINUTES = 30;
    int MAX_QUEST_DURATION_HOURS = 4;

    String QUEST_ID_EXTRA_KEY = "quest_id";
    String IS_TODAY_QUEST_EXTRA_KEY = "is_today_quest";
    int AVATAR_COUNT = 12;
    int QUEST_CALENDAR_EVENT_MIN_DURATION = 15;

    int MAX_UNSCHEDULED_QUEST_VISIBLE_COUNT = 3;

    int RESULT_REMOVED = 100;
    String KEY_APP_RUN_COUNT = "APP_RUN_COUNT";
    String KEY_APP_VERSION_CODE = "APP_VERSION_CODE";
    String KEY_REMOVED_QUESTS = "REMOVED_QUESTS";
    String KEY_PLAYER_ID = "PLAYER_ID";
    String KEY_REMOVED_RECURRENT_QUESTS = "REMOVED_RECURRENT_QUESTS";

    String IPOLI_EMAIL = "hi@ipoli.io";
    String KEY_SHOULD_SHOW_TUTORIAL = "SHOULD_SHOW_TUTORIAL";
    String API_RESOURCE_SOURCE = "ipoli-android";
    int SUGGESTED_SLOTS_COUNT = 7;
}