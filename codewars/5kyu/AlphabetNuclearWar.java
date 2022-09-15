import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphabetNuclearWar {

    private static final String NUCLEAR_HIT_POINT_SYMBOL = "#";
    private static final String SHELTER_START_SYMBOL = "[";
    private static final String SHELTER_END_SYMBOL = "]";

    public static void main(String[] args) {
        System.out.println(alphabetWar("[a]#[b]#[c]"));
    }

    public static String alphabetWar(String battlefield) {
        List<String> battlefieldItems = new ArrayList<>(Arrays.asList(battlefield.split("")));

        while (battlefieldItems.contains("#")) {
            int nuclearHitPointIndex = 0;
            for (int i = 0; i < battlefieldItems.size(); i++) {
                if (battlefieldItems.get(i).equals(NUCLEAR_HIT_POINT_SYMBOL)) {
                    nuclearHitPointIndex = i;
                    break;
                }
            }

            List<Integer> deleteItemIndexes = new ArrayList<>();
            deleteItemIndexes.add(nuclearHitPointIndex);

            int rightDestroyedShelterCount = 0;
            boolean isInShelter = false;
            for (int i = nuclearHitPointIndex + 1; i < battlefieldItems.size(); i++) {
                String target = battlefieldItems.get(i);

                if (isAlphabet(target)) {
                    if (isInShelter) continue;

                    deleteItemIndexes.add(i);
                    continue;
                }

                if (target.equals(SHELTER_START_SYMBOL)) {
                    if (rightDestroyedShelterCount == 0) {
                        deleteItemIndexes.add(i);
                    }
                    isInShelter = true;
                    continue;
                }

                if (target.equals(SHELTER_END_SYMBOL)) {
                    if (rightDestroyedShelterCount == 0) {
                        deleteItemIndexes.add(i);
                        rightDestroyedShelterCount++;
                    }
                    isInShelter = false;
                    continue;
                }
            }


            int leftDestroyedShelterCount = 0;
            boolean isInShelter2 = false;
            for (int i = nuclearHitPointIndex - 1; i >= 0; i--) {
                String target = battlefieldItems.get(i);

                if (isAlphabet(target)) {
                    if (isInShelter2) continue;

                    deleteItemIndexes.add(0, i);
                    continue;
                }

                if (target.equals(SHELTER_END_SYMBOL)) {
                    if (leftDestroyedShelterCount == 0) {
                        deleteItemIndexes.add(0, i);
                    }
                    isInShelter2 = true;
                    continue;
                }

                if (target.equals(SHELTER_START_SYMBOL)) {
                    if (leftDestroyedShelterCount == 0) {
                        deleteItemIndexes.add(0, i);
                        leftDestroyedShelterCount++;
                    }
                    isInShelter2 = false;
                    continue;
                }
            }


            for (int i = deleteItemIndexes.size() - 1; i >= 0; i--) {
                int index = deleteItemIndexes.get(i);
                battlefieldItems.remove(index);
            }
        }

        return String.join("", battlefieldItems);
    }

    private static boolean isAlphabet(String item) {
        return !item.equals(NUCLEAR_HIT_POINT_SYMBOL) && !item.equals(SHELTER_START_SYMBOL)
                && !item.equals(SHELTER_END_SYMBOL);
    }
}

