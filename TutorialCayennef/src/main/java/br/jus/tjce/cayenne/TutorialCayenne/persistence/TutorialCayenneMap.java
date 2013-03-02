package br.jus.tjce.cayenne.TutorialCayenne.persistence;

import br.jus.tjce.cayenne.TutorialCayenne.persistence.auto._TutorialCayenneMap;

public class TutorialCayenneMap extends _TutorialCayenneMap {

    private static TutorialCayenneMap instance;

    private TutorialCayenneMap() {}

    public static TutorialCayenneMap getInstance() {
        if(instance == null) {
            instance = new TutorialCayenneMap();
        }

        return instance;
    }
}
