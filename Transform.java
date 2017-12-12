

/**
 * A class that runs implements several simple transformations on 2D image arrays.
 * <p>
 * This file contains stub code for your image transformation methods that are called by the main
 * class. You will do your work for this MP in this file.
 * <p>
 * Note that you can make several assumptions about the images passed to your functions, both by the
 * web front end and by our testing harness:
 * <ul>
 * <li>You will not be passed empty images.</li>
 * <li>All images will have even width and height.</li>
 * </ul>
 *
 * @see <a href="https://cs125.cs.illinois.edu/MP/4/">MP4 Documentation</a>
 */
public class Transform {

    /**
     * Default amount to shift an image's position. Not used by the testing suite, so feel free to
     * change this value.
     */
    public static final int DEFAULT_POSITION_SHIFT = 16;

    /**
     * Pixel value to use as filler when you don't have any valid data. All white with complete
     * transparency. DO NOT CHANGE THIS VALUE: the testing suite relies on it.
     */
    public static final int FILL_VALUE = 0x00FFFFFF;

    /**
     * Fill any 2D array with FILL_VALUE.
     *
     *@param emptyArray 2D array needed to be filled
     *@return new array containing FILL_VALUE in all indices
     */
    public static int[][] fillArray(final int[][]emptyArray) {
        int[][] newArray = new int[emptyArray.length][emptyArray[0].length];
        for (int i = 0; i < emptyArray.length; i++) {
            for (int j = 0; j < emptyArray[i].length; j++) {
                newArray[i][j] = FILL_VALUE;
            }
        }

        return newArray;
    }

    /**
     * Shift the image left by the specified amount.
     * <p>
     * Any pixels shifted in from off screen should be filled with FILL_VALUE. This function <i>does
     * not modify the original image</i>.
     *
     * @param originalImage the image to shift to the left
     * @param amount the amount to shift the image to the left
     * @return the shifted image
     */
    public static int[][] shiftLeft(final int[][] originalImage, final int amount) {
        /*
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < (originalImage[i].length - amount); j++) {
                newImage[i][j] = originalImage[i][j + amount];
            }
        }

        return newImage;
        */
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = 0; i < (originalImage.length - amount); i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                newImage[i][j] = originalImage[i + amount][j];
            }
        }

        return newImage;
    }

    /*
     * Shift right like above.
     */
    /**
     * Shift the image right by the specified amount
     * Any pixels shifted in from off screen should be filled with FIL_VALUE.
     * This function does not modify the original image
     * @param originalImage the image to shift to the right
     * @param amount the amount to shift the image right by
     * @return the shifted image pixels
     */
    public static int[][] shiftRight(final int[][] originalImage, final int amount) {
        /*
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = (originalImage[i].length - 1); j >= amount; j--) {
                newImage[i][j] = originalImage[i][j - amount];
            }
        }

        return newImage;
        */
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = (originalImage.length - 1); i >= amount; i--) {
            for (int j = 0; j < originalImage[i].length; j++) {
                newImage[i][j] = originalImage[i - amount][j];
            }
        }

        return newImage;
    }

    /**
     * Shift up like above.
     * Shift the image up by the specified amount
     * Any pixels shifted in from off screen should be filled with FIL_VALUE.
     *  This function does not modify the original image
     * @param originalImage the image to shift up
     * @param amount amount to shift the image up by
     * @return the shifted image pixel array
     */
    public static int[][] shiftUp(final int[][] originalImage, final int amount) {
        /*
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = 0; i < (originalImage.length - amount); i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                newImage[i][j] = originalImage[i + amount][j];
            }
        }

        return newImage;
        */
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < (originalImage[i].length - amount); j++) {
                newImage[i][j] = originalImage[i][j + amount];
            }
        }

        return newImage;
    }

    /**
     * Shift down like above.
     * Shift the image down by the specified amount
     * Any pixels shifted in from off screen should be filled with FIL_VALUE.
     * This function does not modify the original image
     * @param originalImage the image to shift down
     * @param amount the amount to shift the image down by
     * @return the shifted image pixels
     */
    public static int[][] shiftDown(final int[][] originalImage, final int amount) {
        /*
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = (originalImage.length - 1); i >= amount; i--) {
            for (int j = 0; j < originalImage[i].length; j++) {
                newImage[i][j] = originalImage[i - amount][j];
            }
        }

        return newImage;
        */
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        newImage = fillArray(newImage);

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = (originalImage[i].length - 1); j >= amount; j--) {
                newImage[i][j] = originalImage[i][j - amount];
            }
        }

        return newImage;
    }


    /**
     * Rotate the image left by 90 degrees around its center.
     * <p>
     * Any pixels rotated in from off screen should be filled with FILL_VALUE. This function <i>does
     * not modify the original image</i>.
     *
     * @param originalImage the image to rotate left 90 degrees
     * @return the rotated image
     */
    public static int[][] rotateLeft(final int[][] originalImage) {
        return null;
    }

    /*
     * Rotate the image right like above.
     */
    /**
     * Rotate the image right by 90 degrees around its center.
     * <p>
     * Any pixels rotated in from off screen should be filled with FILL_VALUE. This function <i>does
     * not modify the original image</i>.
     *
     * @param originalImage the image to rotate right 90 degrees
     * @return the rotated image
     */
    public static int[][] rotateRight(final int[][] originalImage) {
        return null;
    }

    /*
     * Flip the image on the vertical axis across its center.
     */
    /**
     * Flip the image across the vertical axis.
     * @param originalImage the image to flip across the center vertical axis
     * @return the flipped image
     */
    public static int[][] flipVertical(final int[][] originalImage) {
        return null;
    }

    /*
     * Flip the image on the horizontal axis across its center.
     */
    /**
     * Flip the image across the horizontal axis.
     * @param originalImage the image to flip across the center horizontal axis
     * @return the flipped image
     */
    public static int[][] flipHorizontal(final int[][] originalImage) {
        return null;
    }

    /**
     * Default amount to shift colors by. Not used by the testing suite, so feel free to change this
     * value.
     */
    public static final int DEFAULT_COLOR_SHIFT = 32;

    /**
     * Amount to shift alpha bits by.
     */
    public static final int ALPHA_SHIFT = 24;

    /**
     * Amount to shift blue bits by.
     */
    public static final int BLUE_SHIFT = 16;

    /**
     * Amount to shift green bits by.
     */
    public static final int GREEN_SHIFT = 8;


    /**
     * Add red to the image.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to add red to
     * @param amount the amount of red to add
     * @return the recolored image
     */
    public static int[][] moreRed(final int[][] originalImage, final int amount) {
        /*
        final int maxSize = 255;

        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentRed = redValue(originalImage[i][j]);
                int newRed = currentRed + amount;
                if (newRed > maxSize) {
                    newRed = maxSize;
                }
                int newAmount = newRed - currentRed;
                newImage[i][j] = originalImage[i][j] + newAmount;
            }
        }
        */

        final int maxSize = 255;
        int[][] newImage = new int[originalImage.length][originalImage[0].length];

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int red = redValue(originalImage[i][j]);
                int green = greenValue(originalImage[i][j]);
                int blue = blueValue(originalImage[i][j]);
                int alpha = alphaValue(originalImage[i][j]);

                int newRed = red + amount;
                if (newRed > maxSize) {
                    newRed = maxSize;
                }
                if (newRed < 0) {
                    newRed = 0;
                }

                newImage[i][j] = ((alpha << ALPHA_SHIFT) | (blue << BLUE_SHIFT)
                        | (green << GREEN_SHIFT) | newRed);
            }
        }

        return newImage;
    }

    /*
     * Remove red from the image.
     */
    /**
     * Remove red from the image.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to remove red from
     * @param amount the amount of red to remove
     * @return the recolored image
     */
    public static int[][] lessRed(final int[][] originalImage, final int amount) {
        /*
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentRed = redValue(originalImage[i][j]);
                int newRed = currentRed - amount;
                if (newRed < 0) {
                    newRed = 0;
                }
                int newAmount = currentRed - newRed;
                newImage[i][j] = currentRed - newAmount;
            }
        }
        return newImage;
        */

        return moreRed(originalImage, -1 * amount);
    }

    /*
     * Add green to the image.
     */
    /**
     * Add green to the image.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to add green to
     * @param amount the amount of green to add
     * @return the recolored image
     */
    public static int[][] moreGreen(final int[][] originalImage, final int amount) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        final int maxSize = 255;
        final int bitShift = 8;

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentGreen = greenValue(originalImage[i][j]);
                int currentRed = redValue(originalImage[i][j]);

                int newGreen = currentGreen + amount;
                if (newGreen > maxSize) {
                    newGreen = maxSize;
                }
                int newAmount = newGreen - currentGreen;

                int temp = originalImage[i][j] >> bitShift;
                temp = temp + newAmount;

                temp = temp << bitShift;
                newImage[i][j] = temp + currentRed;
            }
        }

        return newImage;
    }

    /*
     * Remove green from the image.
     */
    /**
     * Remove green from the image.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to remove green from
     * @param amount the amount of green to remove
     * @return the recolored image
     */
    public static int[][] lessGreen(final int[][] originalImage, final int amount) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];

        final int bitShift = 8;

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentGreen = greenValue(originalImage[i][j]);
                int currentRed = redValue(originalImage[i][j]);

                int newGreen = currentGreen - amount;
                if (newGreen < 0) {
                    newGreen = 0;
                }
                int newAmount = currentGreen - newGreen;

                int temp = originalImage[i][j] >> bitShift;
                temp = temp - newAmount;

                temp = temp << bitShift;
                newImage[i][j] = temp + currentRed;
            }
        }

        return newImage;
    }

    /**
     * Add blue to the image.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to add blue to
     * @param amount the amount of blue to add
     * @return the recolored image
     */
    public static int[][] moreBlue(final int[][] originalImage, final int amount) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        final int maxSize = 255;
        final int bitShift = 16;

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentBlue = blueValue(originalImage[i][j]);
                int currentGreen = greenValue(originalImage[i][j]);
                int currentRed = redValue(originalImage[i][j]);

                int newBlue = currentBlue + amount;
                if (newBlue > maxSize) {
                    newBlue = maxSize;
                }
                int newAmount = newBlue - currentBlue;

                int temp = originalImage[i][j] >> bitShift;
                temp = temp + newAmount;

                temp = temp << (bitShift / 2);
                temp = temp + currentGreen;

                temp = temp << (bitShift / 2);
                temp = temp + currentRed;

                newImage[i][j] = temp;
            }
        }

        return newImage;
    }

    /*
     * Remove blue from the image.
     */
    /**
     * Remove blue from the image.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to remove blue from
     * @param amount the amount of blue to remove
     * @return the recolored image
     */
    public static int[][] lessBlue(final int[][] originalImage, final int amount) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        final int bitShift = 16;
        final int colorShift = 8;

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentBlue = blueValue(originalImage[i][j]);
                int currentGreen = greenValue(originalImage[i][j]);
                int currentRed = redValue(originalImage[i][j]);

                int newBlue = currentBlue - amount;
                if (newBlue < 0) {
                    newBlue = 0;
                }
                int newAmount = currentBlue - newBlue;

                int temp = originalImage[i][j] >> bitShift;
                temp = temp - newAmount;

                temp = temp << colorShift;
                temp = temp + currentGreen;

                temp = temp << colorShift;
                temp = temp + currentRed;

                newImage[i][j] = temp;
            }
        }

        return newImage;
    }

    /*
     * Increase the image alpha channel.
     */
    /**
     * Increase the image alpha channel.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to increase the image alpha value for
     * @param amount the amount by which alpha channel is increased
     * @return the recolored image
     */
    public static int[][] moreAlpha(final int[][] originalImage, final int amount) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        final int maxSize = 255;
        final int bitShift = 24;
        final int colorShift = 8;

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentAlpha = alphaValue(originalImage[i][j]);
                int currentBlue = blueValue(originalImage[i][j]);
                int currentGreen = greenValue(originalImage[i][j]);
                int currentRed = redValue(originalImage[i][j]);

                int newAlpha = currentAlpha + amount;
                if (newAlpha > maxSize) {
                    newAlpha = maxSize;
                }
                int newAmount = newAlpha - currentAlpha;

                int temp = originalImage[i][j] >>> bitShift;
                temp = temp + newAmount;

                temp = temp << colorShift;
                temp = temp + currentBlue;

                temp = temp << colorShift;
                temp = temp + currentGreen;

                temp = temp << colorShift;
                temp = temp + currentRed;

                newImage[i][j] = temp;
            }
        }

        return newImage;
    }

    /*
     * Decrease the image alpha channel.
     */
    /**
     * Decrease the image alpha channel.
     * <p>
     * This function <i>does not modify the original image</i>. It should also not generate any new
     * filled pixels.
     *
     * @param originalImage the image to decrease the image alpha value for
     * @param amount the amount by which alpha channel is decreased
     * @return the recolored image
     */
    public static int[][] lessAlpha(final int[][] originalImage, final int amount) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];
        final int bitShift = 24;
        final int colorShift = 8;

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int currentAlpha = alphaValue(originalImage[i][j]);
                int currentBlue = blueValue(originalImage[i][j]);
                int currentGreen = greenValue(originalImage[i][j]);
                int currentRed = redValue(originalImage[i][j]);

                int newAlpha = currentAlpha - amount;
                if (newAlpha < 0) {
                    newAlpha = 0;
                }
                int newAmount = currentAlpha - newAlpha;

                int temp = originalImage[i][j] >>> bitShift;
                temp = temp - newAmount;

                temp = temp << colorShift;
                temp = temp + currentBlue;

                temp = temp << colorShift;
                temp = temp + currentGreen;

                temp = temp << colorShift;
                temp = temp + currentRed;

                newImage[i][j] = temp;

            }
        }

        return newImage;
    }

    /**
     * The default resize factor. Not used by the testing suite, so feel free to change this value.
     */
    public static final int DEFAULT_RESIZE_AMOUNT = 2;

    /**
     * Shrink in the vertical axis around the image center.
     * <p>
     * An amount of 2 will result in an image that is half its original height. An amount of 3 will
     * result in an image that's a third of its original height. Any pixels shrunk in from off
     * screen should be filled with FILL_VALUE. This function <i>does not modify the original
     * image</i>.
     *
     * @param originalImage the image to shrink
     * @param amount the factor by which the image's height is reduced
     * @return the shrunken image
     */
    public static int[][] shrinkVertical(final int[][] originalImage, final int amount) {
        return moreBright(originalImage, amount);
    }

    /*
     * Expand in the vertical axis around the image center.
     */
    /**
     * Expand in the vertical axis around the image center.
     * <p>
     * An amount of 2 will result in an image that is twice its original height. An amount of 3 will
     * result in an image that's three times its original height.
     * This function <i>does not modify the original
     * image</i>.
     *
     * @param originalImage the image to expand
     * @param amount the factor by which the image's height is increased
     * @return the expanded image
     */
    public static int[][] expandVertical(final int[][] originalImage, final int amount) {
        return lessBright(originalImage, amount);
    }

    /*
     * Shrink in the horizontal axis around the image center.
     */
    /**
     * Shrink in the horizontal axis around the image center.
     * <p>
     * An amount of 2 will result in an image that is half its original width. An amount of 3 will
     * result in an image that's a third of its original width. Any pixels shrunk in from off
     * screen should be filled with FILL_VALUE. This function <i>does not modify the original
     * image</i>.
     *
     * @param originalImage the image to shrink
     * @param amount the factor by which the image's width is reduced
     * @return the expanded image
     */
    public static int[][] shrinkHorizontal(final int[][] originalImage, final int amount) {
        return invertedColors(originalImage);
    }

    /*
     * Expand in the horizontal axis around the image center.
     */
    /**
     * Expand in the horizontal axis around the image center.
     * <p>
     * An amount of 2 will result in an image that is twice its original width. An amount of 3 will
     * result in an image that's three times its original width. Any pixels shrunk in from off
     * screen should be filled with FILL_VALUE. This function <i>does not modify the original
     * image</i>.
     *
     * @param originalImage the image to expand
     * @param amount the factor by which the image's width is expanded
     * @return the shrunken image
     */
    public static int[][] expandHorizontal(final int[][] originalImage, final int amount) {
        return contrast(originalImage, amount);
    }

    /**
     * Remove a green screen mask from an image.
     * <p>
     * This function should remove primarily green pixels from an image and replace them with
     * transparent pixels (FILL_VALUE), allowing you to achieve a green screen effect. Obviously
     * this function will destroy pixels, but it <i>does not modify the original image</i>.
     * <p>
     * While this function is tested by the test suite, only extreme edge cases are used. Getting it
     * work work will with real green screen images is left as a challenge for you.
     *
     * @param originalImage the image to remove a green screen from
     * @return the image with the green screen removed
     */
    public static int[][] greenScreen(final int[][] originalImage) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                int red = redValue(originalImage[i][j]);
                int green = greenValue(originalImage[i][j]);
                int blue = blueValue(originalImage[i][j]);
                //int alpha = alphaValue(originalImage[i][j]);

                if (green > red && green > blue) {
                    newImage[i][j] = FILL_VALUE;
                } else {
                    newImage[i][j] = originalImage[i][j];
                }
            }
        }

        return newImage;
    }

    /**
     * A wild and mysterious image transform.
     * <p>
     * You are free to implement this in any way you want. It is not tested rigorously by the test
     * suite, but it should do something (change the original image) and <i>not modify the original
     * image</i>.
     * <p>
     * Call this function mystery. It should take only the original image as a single argument and
     * return a modified image.
     *
     * @param originalImage the image to perform a strange and interesting transform on
     * @return the image transformed in wooly and frightening ways
     */
    public static int[][] mystery(final int[][] originalImage) {
        return greyScale(originalImage);
    }

    /**
     * More bright.
     *
     * @param originalImage the original image
     * @param amount the amount
     * @return the int[][]
     */
    public static int[][] moreBright(final int[][] originalImage, final int amount) {
        int x = originalImage.length;
        int y = originalImage[0].length;
        int[][] array = new int[x][y];
        final int r = 0;
        final int g = 8;
        final int b = 16;
        final int a = 24;
        for (int col = 0; col < y; col++) {
            for (int row = 0; row < x; row++) {
                int red = ((originalImage[row][col] >> r) & BYTE_MASK) + amount;
                int green = ((originalImage[row][col] >> g) & BYTE_MASK) + amount;
                int blue = ((originalImage[row][col] >> b) & BYTE_MASK) + amount;
                int alpha = ((originalImage[row][col] >> a) & BYTE_MASK);
                if (blue > MAX_COLOR) {
                    blue = MAX_COLOR;
                } else if (blue < 0) {
                    blue = 0;
                }
                if (green > MAX_COLOR) {
                    green = MAX_COLOR;
                } else if (green < 0) {
                    green = 0;
                }
                if (red > MAX_COLOR) {
                    red = MAX_COLOR;
                } else if (red < 0) {
                    red = 0;
                }
                array[row][col] = (red << r) | (green << g) | (blue << b) | (alpha << a);
            }
        }
        return array;
    }
    /**
     * Less bright.
     *
     * @param originalImage the original image
     * @param amount the amount
     * @return the int[][]
     */
    public static int[][] lessBright(final int[][] originalImage, final int amount) {
        return moreBright(originalImage, -amount);
    }

    /**
     * The thing I use to make the numbers good.
     */
    private static final int BYTE_MASK = 0xFF;

    /** The num. */
    private static final int NUM = 259;

    /**the maximum color a pixel can have.*/
    private static final int MAX_COLOR = 255;

    /** The Constant TEMP. */
    public static final int TEMP = 128;

    /**
     * Contrast.
     *
     * @param originalImage the image to perform a strange and interesting transform on
     * @param contrast the contrast
     * @return the image transformed in wooly and frightening ways
     */
    public static int[][] contrast(final int[][] originalImage, final int contrast) {
        int factor = (NUM * (contrast + MAX_COLOR)) / (MAX_COLOR * (NUM - contrast));
        int x = originalImage.length;
        int y = originalImage[0].length;
        int[][] array = new int[x][y];
        final int r = 0;
        final int g = 8;
        final int b = 16;
        final int a = 24;
        for (int col = 0; col < y; col++) {
            for (int row = 0; row < x; row++) {
                int red = factor * (((originalImage[row][col] >> r) & BYTE_MASK) - TEMP) + TEMP;
                int green = factor * (((originalImage[row][col] >> g) & BYTE_MASK) - TEMP) + TEMP;
                int blue = factor * (((originalImage[row][col] >> b) & BYTE_MASK) - TEMP) + TEMP;
                int alpha = ((originalImage[row][col] >> a) & BYTE_MASK);
                if (blue > MAX_COLOR) {
                    blue = MAX_COLOR;
                } else if (blue < 0) {
                    blue = 0;
                }
                if (green > MAX_COLOR) {
                    green = MAX_COLOR;
                } else if (green < 0) {
                    green = 0;
                }
                if (red > MAX_COLOR) {
                    red = MAX_COLOR;
                } else if (red < 0) {
                    red = 0;
                }
                array[row][col] = (red << r) | (green << g) | (blue << b) | (alpha << a);
            }
        }
        return array;
    }


    /**
     * Method to implement a sepia filter.
     *
     * @param originalImage 2D array of image pixels
     * @return Filtered image
     */
    public static int[][] sepiaFilter(final int[][] originalImage) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                final int three = 3;

                int alpha = alphaValue(originalImage[i][j]);
                int red = redValue(originalImage[i][j]);
                int green = greenValue(originalImage[i][j]);
                int blue = blueValue(originalImage[i][j]);

                int average = (red + green + blue) / three;

                final int redConstant = 50;
                final int cMax = 255;

                if (red + redConstant + average > cMax) {
                    red = cMax;
                } else {
                    red = red + redConstant + average;
                }

                green += average;
                blue += average;
                if (green > cMax) {
                    green = cMax;
                } else if (blue > cMax) {
                    blue = cMax;
                }

                blue -= (redConstant + 0);
                green -= (redConstant);

                /*
                if (green != 0 && blue != 0) {
                    double gRatio = red / green;
                    double bRatio = red / blue;
                    green = (int) (red * gRatio);
                    blue = (int) (red * bRatio);
                }
                */


                newImage[i][j] = newColor(alpha, red, green, blue);
            }
        }

        return newImage;
    }

    /**
     * Inverts the colors of every pixel in an image.
     * @param originalImage 2D array of pixels in image.
     * @return Copy of original image with inverted colors.
     */
    public static int[][] invertedColors(final int[][] originalImage) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                final int x = 255;
                int r = x - redValue(originalImage[i][j]);
                int g = x - greenValue(originalImage[i][j]);
                int b = x - blueValue(originalImage[i][j]);

                newImage[i][j] = newColor(alphaValue(originalImage[i][j]), r, g, b);
            }
        }

        return newImage;
    }

    /**
     * Takes an image array and returns a grey scaled version of it.
     * @param originalImage 2d array of image's pixels
     * @return grey scaled version of image
     */
    public static int[][] greyScale(final int[][] originalImage) {
        int[][] newImage = new int[originalImage.length][originalImage[0].length];

        for (int i = 0; i < originalImage.length; i++) {
            for (int j = 0; j < originalImage[i].length; j++) {
                final int three = 3;
                int average = (redValue(originalImage[i][j]) + greenValue(originalImage[i][j])
                + blueValue(originalImage[i][j])) / three;

                newImage[i][j] = averageDistribution(alphaValue(originalImage[i][j]), average);
            }
        }

        return newImage;
    }


    //HELPER METHODS

    /**
     * base value by which to multiple hex digits.
     */
    public static final int HEX_BASE = 16;

    /**
     * length of hex value.
     */
    public static final int HEX_LENGTH = 8;

    /**
     * Outputs the amount of red in a given pixel integer representation.
     *
     * @param pixelValue total color value of pixel
     * @return the amount of red in a pixel
     */
    public static int redValue(final int pixelValue) {
        /*
        int redAmount = 0;
        char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        String hexValue = Integer.toHexString(pixelValue);
        while (hexValue.length() < HEX_LENGTH) {
            hexValue = '0' + hexValue;
        }
        String redHex = hexValue.substring(hexValue.length() - 2, hexValue.length());

        for (int i = 0; i < hexValues.length; i++) {
            if (redHex.charAt(0) == hexValues[i]) {
                redAmount += i * HEX_BASE;
            }
            if (redHex.charAt(1) == hexValues[i]) {
                redAmount += i;
            }
        }
        return redAmount;
        */

        final int maskRed = 0x000000FF;
        int redValue = pixelValue & maskRed;

        return redValue;
    }

    /**
     * Outputs the amount of green in a given pixel integer representation.
     *
     * @param pixelValue total color value of pixel
     * @return the amount of green in a pixel
     */
    public static int greenValue(final int pixelValue) {
        /*
        int greenAmount = 0;
        final int bitshift = 4;
        char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        String hexValue = Integer.toHexString(pixelValue);
        while (hexValue.length() < HEX_LENGTH) {
            hexValue = '0' + hexValue;
        }
        String greenHex = hexValue.substring(hexValue.length() - bitshift, hexValue.length() - 2);

        for (int i = 0; i < hexValues.length; i++) {
            if (greenHex.charAt(0) == hexValues[i]) {
                greenAmount += i * HEX_BASE;
            }
            if (greenHex.charAt(1) == hexValues[i]) {
                greenAmount += i;
            }
        }
        return greenAmount;
        */

        final int maskGreen = 0x0000FF00;
        int greenIso = pixelValue & maskGreen;
        final int bitShift = 8;

        return (greenIso >> bitShift);
    }

    /**
     * Outputs the amount of blue in a given pixel integer representation.
     *
     * @param pixelValue total color value of pixel
     * @return the amount of blue in a pixel
     */
    public static int blueValue(final int pixelValue) {
        /*
        int blueAmount = 0;
        final int bitshift = 6;
        final int bitshiftHigh = 4;
        char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        String hexValue = Integer.toHexString(pixelValue);
        while (hexValue.length() < HEX_LENGTH) {
            hexValue = '0' + hexValue;
        }
        String blueHex = hexValue.substring(hexValue.length() - bitshift,
                hexValue.length() - bitshiftHigh);

        for (int i = 0; i < hexValues.length; i++) {
            if (blueHex.charAt(0) == hexValues[i]) {
                blueAmount += i * HEX_BASE;
            }
            if (blueHex.charAt(1) == hexValues[i]) {
                blueAmount += i;
            }
        }
        return blueAmount;
        */

        final int maskBlue = 0x00FF0000;
        int blueIso = pixelValue & maskBlue;
        final int bitShift = 16;

        return (blueIso >> bitShift);
    }

    /**
     * Outputs the alpha channel amount in a given pixel integer representation.
     * @param pixelValue total color value of pixel
     * @return amount in the alpha channel of a pixel
     */
    public static int alphaValue(final int pixelValue) {
        /*
        int alphaAmount = 0;
        final int bitshift = 8;
        final int bitshiftHigh = 6;
        char[] hexValues = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        String hexValue = Integer.toHexString(pixelValue);
        while (hexValue.length() < HEX_LENGTH) {
            hexValue = '0' + hexValue;
        }
        String alphaHex = hexValue.substring(hexValue.length() - bitshift,
                hexValue.length() - bitshiftHigh);

        for (int i = 0; i < hexValues.length; i++) {
            if (alphaHex.charAt(0) == hexValues[i]) {
                alphaAmount += i * HEX_BASE;
            }
            if (alphaHex.charAt(1) == hexValues[i]) {
                alphaAmount += i;
            }
        }
        return alphaAmount;
        */

        final int maskAlpha = 0xFF000000;
        int alphaIso = pixelValue & maskAlpha;
        final int bitShift = 24;

        return (alphaIso >>> bitShift);
    }

    /**
     * This is a helper method for the greyScale mystery method.
     * This method makes the value of all three colors the average value.
     * @param originalAlpha Alpha value to remain constant
     * @param average the average value of all three colors
     * @return a new int representing all three colors having the value of average.
     */
    public static int averageDistribution(final int originalAlpha, final int average) {

        final int bitShift = 8;
        int finalColor = (originalAlpha  << bitShift);

        finalColor += average;
        finalColor = finalColor << bitShift;

        finalColor += average;
        finalColor = finalColor <<  bitShift;

        finalColor += average;

        return finalColor;
    }

    /**
     * Makes a new color value of form xAABBGGRR.
     * @param a alpha value
     * @param r red color value
     * @param g green color value
     * @param b blue color value
     * @return final color value
     */
    public static int newColor(final int a, final int r, final int g, final int b) {
        final int bitShift = 8;
        int finalColor = a << bitShift;

        finalColor += b;
        finalColor = finalColor << bitShift;

        finalColor += g;
        finalColor = finalColor << bitShift;

        finalColor += r;

        return finalColor;
    }

}
