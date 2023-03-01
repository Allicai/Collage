import java.awt.*;
import java.util.Arrays;

public class Pixel {
  private int[] rgba;
  private Coord coords;

  private int value;
  private int intensity;

  private int luma;


  /**
   * Basic constructor for the Pixel class.
   * @param rgba the colors, red, green, blue and alpha value in order to generate a color
   * @param coords the coordinates of the pixel on the plane.
   */
  Pixel(int[] rgba, Coord coords) {
    this.rgba = new int[4];
    this.coords = coords;
    value = Arrays.stream(rgba).max().getAsInt();
    intensity = (int)Math.ceil(Arrays.stream(rgba).average().orElse(Double.NaN));
    luma =  (int)Math.ceil((.2126 * rgba[0])+ .6152 * rgba[1]+ .0722 * rgba[2]);

  }

  public void resetVIL() {
    value = Arrays.stream(rgba).max().getAsInt();
    intensity = (int)Math.ceil(Arrays.stream(rgba).average().orElse(Double.NaN));
    luma =  (int)Math.ceil((.2126 * rgba[0])+ .6152 * rgba[1]+ .0722 * rgba[2]);

  }

  /**
   * Set the pixels color values to the given list of values
   * @param rgba the given color and alpha values.
   */
  public void setRgba(int[] rgba) {
    this.rgba = rgba;
  }

  /**
   * Give the list of rgba values.
   * @return an Array where the first index value is red value, second green, and so on for a
   * size 4.
   */
  public int[] getRgba() {
    return rgba;
  }


  /**
   * Create a color using the Pixel values of rgb.
   * @return an instance of the Color object.
   */
  public Color createColor() {
    return new Color(this.rgba[0], this.rgba[1], this.rgba[2]);
  }

  /**
   * Return true if the two pixels have the same rgba values.
   * @param other a given Pixel to be compared.
   * @return a boolean true if the two pixels rgba are the same and a boolean false if they are not.
   */
  public boolean compareRgba(Pixel other) {
    Boolean flag = true;
    if(other.rgba.length == this.rgba.length) {
      for(int i = 0; i < this.rgba.length; i++) {
        if(this.rgba[i] != other.rgba[i]) {
          flag = false;
        }  // Do nothing because this is what we want

      }
    } else {
      return false;
    } return flag;
  }

  /**
   * Compares the numbers in regard to the brightness and intensity.
   * @param other the other Pixel object being compared.
   * @return a boolean to indicate if the VIL are the same for both.
   */
  public boolean compareVIL(Pixel other) {
    return this.intensity == other.intensity && this.value == other.value
            && this.luma == other.luma;
  }


  /**
   * Compare all the values of two pixels.
   * @param other the given Pixel object to be compared.
   * @return true if all the values including, rgba, value, intensity, luma and coordinates are
   * the same.
   */
  public boolean comparePixels(Pixel other) {
    return this.compareVIL(other) && this.compareRgba(other)
            && this.coords.compareCoords(other.coords);
  }


}
