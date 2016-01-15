package io.ipoli.android.quest.persistence;

import java.util.List;

import io.ipoli.android.quest.Quest;

/**
 * Created by Venelin Valkov <venelin@curiousily.com>
 * on 1/7/16.
 */
public interface QuestPersistenceService {
    Quest save(Quest quest);

    List<Quest> saveAll(List<Quest> quests);

    List<Quest> findAllUncompleted();

    List<Quest> findAllPlannedForToday();

    List<Quest> findAllForToday();

    long countAllUncompleted();

    long countAllPlannedForToday();

    void delete(Quest quest);
}