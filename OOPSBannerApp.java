/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap
 * class to encapsulate character-to-pattern mappings.
 *
 * The application retrieves and displays the "OOPS"
 * banner using these mappings. This approach enhances
 * code organization, reusability and modularity.
 *
 * @author Developer
 * @version 7.0
 */

// Extend the User Story 6 to implement a CharacterPatternMap class
// to encapsulate character-to-pattern mappings.
//
// The application retrieves and displays the "OOPS"
// banner using these mappings.
//
// Thereby addressing the drawback of not having a
// centralized character pattern management system.
//
// Key Requirements:
//
// 1. Create CharacterPatternMap class to hold character and its pattern
// 2. Implement methods to create and retrieve character patterns
// 3. Use CharacterPatternMap to display the "OOPS" banner
// 4. Implement modular and reusable character pattern management
//
// Drawback of this approach is that we are creating
// CharacterPatternMap objects for every character.
// This can later be optimized using collections like HashMap.

public class OOPSBannerApp {

    /**
     * CharacterPatternMap - Inner class for storing
     * character-to-pattern mappings.
     *
     * Encapsulates a single character and its
     * corresponding ASCII art pattern.
     *
     * Provides immutable access to character and
     * pattern data through getters.
     */
    static class CharacterPatternMap {

        /** The character being represented */
        private Character character;

        /** The ASCII art pattern lines */
        private String[] pattern;

        /**
         * Constructs a CharacterPatternMap
         * with a character and its pattern.
         *
         * @param character the character to be mapped
         * @param pattern the ASCII art pattern
         *                representation as array of strings
         */
        public CharacterPatternMap(
                Character character,
                String[] pattern) {

            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Retrieves the mapped character.
         *
         * @return the character associated
         * with this pattern map
         */
        public Character getCharacter() {

            return character;
        }

        /**
         * Retrieves the ASCII art pattern.
         *
         * @return the pattern array
         * representing the character
         */
        public String[] getPattern() {

            return pattern;
        }
    }

    /**
     * Static Method to create and initialize
     * CharacterPatternMap array for predefined characters.
     *
     * Populates pattern maps for letters
     * 'O', 'P', 'S' and space character.
     *
     * Each character has a 7-line ASCII art representation.
     *
     * @return array of CharacterPatternMap objects
     * containing character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps =
                new CharacterPatternMap[4];

        // Populate O pattern

        charMaps[0] = new CharacterPatternMap(
                'O',
                new String[]{

                        "  ***   ",
                        " ** **  ",
                        "**   ** ",
                        "**   ** ",
                        "**   ** ",
                        " ** **  ",
                        "  ***   "
                });

        // Populate P pattern

        charMaps[1] = new CharacterPatternMap(
                'P',
                new String[]{

                        "*****   ",
                        "**  **  ",
                        "**  **  ",
                        "*****   ",
                        "**      ",
                        "**      ",
                        "**      "
                });

        // Populate S pattern

        charMaps[2] = new CharacterPatternMap(
                'S',
                new String[]{

                        " *****  ",
                        "**      ",
                        "**      ",
                        " ****   ",
                        "    **  ",
                        "    **  ",
                        "*****   "
                });

        // Populate space pattern

        charMaps[3] = new CharacterPatternMap(
                ' ',
                new String[]{

                        "        ",
                        "        ",
                        "        ",
                        "        ",
                        "        ",
                        "        ",
                        "        "
                });

        return charMaps;
    }

    /**
     * Retrieves the ASCII pattern
     * for a given character.
     *
     * Searches through the character
     * pattern maps to find a matching character.
     *
     * If the character is not found,
     * recursively returns the pattern
     * for space character.
     *
     * @param ch the character to look up
     * @param charMaps the array of
     * CharacterPatternMap objects
     *
     * @return the pattern array
     * for the given character
     */
    public static String[] getCharacterPattern(
            char ch,
            CharacterPatternMap[] charMaps) {

        // Loop through pattern maps

        for (CharacterPatternMap map : charMaps) {

            // Return matching pattern

            if (map.getCharacter() == ch) {

                return map.getPattern();
            }
        }

        // Return space pattern if not found

        return getCharacterPattern(' ', charMaps);
    }

    /**
     * Prints a message as a banner
     * using ASCII art patterns.
     *
     * Renders the entire message
     * horizontally by combining
     * individual character patterns
     * line by line.
     *
     * Characters are separated by
     * spacing for readability.
     *
     * @param message the message
     * to be displayed
     *
     * @param charMaps the array of
     * CharacterPatternMap objects
     */
    public static void printMessage(
            String message,
            CharacterPatternMap[] charMaps) {

        // Each banner has 7 rows

        for (int row = 0; row < 7; row++) {

            // StringBuilder for efficient concatenation

            StringBuilder line =
                    new StringBuilder();

            // Traverse each character

            for (char ch : message.toCharArray()) {

                line.append(

                        getCharacterPattern(
                                ch,
                                charMaps)[row]

                ).append(" ");
            }

            // Print assembled row

            System.out.println(line);
        }
    }

    /**
     * Main Method
     *
     * Entry point for the banner
     * display application.
     *
     * Initializes character pattern maps
     * and displays "OOPS"
     * as an ASCII art banner.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create CharacterPatternMap array

        CharacterPatternMap[] charMaps =
                createCharacterPatternMaps();

        // Define message

        String message = "OOPS";

        // Print banner message

        printMessage(
                message,
                charMaps
        );
    }
}