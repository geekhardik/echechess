/*
 *    Copyright 2014 - 2017 Yannick Watier
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package ca.watier.sessions;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by yannick on 4/17/2017.
 */
public class Player {
    private List<UUID> gameList = new ArrayList<>();
    private UUID lastGameCreated;

    public void addGame(UUID uuid) {
        lastGameCreated = uuid;
        gameList.add(uuid);
    }

    public List<UUID> getGameList() {
        return gameList;
    }

    public UUID getLastGameCreated() {
        return lastGameCreated;
    }
}