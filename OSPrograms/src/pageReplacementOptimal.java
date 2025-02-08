import java.util.*;
public class pageReplacementOptimal {
            // Function to find the index of the page that will not be used in the future for the longest time
            private static int predict(int[] pages, int[] frames, int index, int numFrames) {
                int res = -1, farthest = index;
                for (int i = 0; i < numFrames; i++) {
                    int j;
                    for (j = index; j < pages.length; j++) {
                        if (frames[i] == pages[j]) {
                            if (j > farthest) {
                                farthest = j;
                                res = i;
                            }
                            break;
                        }
                    }
                    if (j == pages.length) {
                        return i;
                    }
                }
                return res == -1 ? 0 : res;
            }

            // Function to implement the Optimal Page Replacement Algorithm
            public static void optimalPage(int[] pages, int numFrames) {
                int[] frames = new int[numFrames];
                Arrays.fill(frames, -1); // Initialize frames to -1
                int pageFaults = 0;

                for (int i = 0; i < pages.length; i++) {
                    boolean hit = false;
                    for (int j = 0; j < numFrames; j++) {
                        if (frames[j] == pages[i]) {
                            hit = true;
                            break;
                        }
                    }

                    // If it's a miss (page fault)
                    if (!hit) {
                        pageFaults++;
                        int replaceIndex;
                        // If there are empty frames
                        if (Arrays.asList(frames).contains(-1)) {
                            replaceIndex = Arrays.asList(frames).indexOf(-1);
                        } else {
                            replaceIndex = predict(pages, frames, i + 1, numFrames);
                        }
                        frames[replaceIndex] = pages[i];
                    }

                    // Display the current state of frames
                    System.out.print("Frame: ");
                    for (int j : frames) {
                        if (j == -1)
                            System.out.print("Empty ");
                        else
                            System.out.print(j + " ");
                    }
                    System.out.println();
                }

                System.out.println("Total Page Faults: " + pageFaults);
            }

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of frames: ");
                int numFrames = sc.nextInt();

                System.out.print("Enter the number of pages: ");
                int numPages = sc.nextInt();

                int[] pages = new int[numPages];
                System.out.println("Enter the page reference string:");
                for (int i = 0; i < numPages; i++) {
                    pages[i] = sc.nextInt();
                }

                optimalPage(pages, numFrames);
            }
        }
