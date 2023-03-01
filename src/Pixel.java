import java.util.Arrays;

public class Pixel {
  private int[] rgba;
  private Coord coords;

  private int value;
  private int intensity;

  private int luma;


  Pixel(int[] rgba, Coord coords) {
    this.rgba = new int[4];
    this.coords = coords;
    value = Arrays.stream(rgba).max().getAsInt();
    intensity = (int)Math.ceil(Arrays.stream(rgba).average().orElse(Double.NaN));

  }
}
