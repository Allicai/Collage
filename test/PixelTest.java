import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PixelTest {

  int[] blue = {0,0, 255};
  int[] red = {255,0, 0};
  int[] green = {0,255, 0};

  Coord coord1 = new Coord(0, 0);
  Coord coord2 = new Coord(0, 2);
  Coord coord3 = new Coord(1, 1);
  Pixel pixelGreen; //= new Pixel(blue, coord1);
  Pixel pixelRed;// = new Pixel(red, coord2);
  Pixel pixelBlue;// = new Pixel(green, coord3);

  @Test
  public void validConstruction() {
    try {
      pixelGreen = new Pixel(green, coord1);
    } catch (IllegalArgumentException e) {
      //
    }
    assertEquals(183, pixelGreen.getLumosity());
    assertEquals(85, pixelGreen.getIntensity());
    assertEquals(255, pixelGreen.getValue());

  }
  @Test
  public void resetVIL() {
  }

  @Test
  public void setRgba() {
  }

  @Test
  public void getRgba() {
  }

  @Test
  public void createColor() {
  }

  @Test
  public void compareRgba() {
  }

  @Test
  public void compareVIL() {
  }

  @Test
  public void comparePixels() {
  }

  @Test
  public void testResetVIL() {
  }

  @Test
  public void testSetRgba() {
  }

  @Test
  public void testGetRgba() {
  }

  @Test
  public void getLumosity() {
  }

  @Test
  public void testCreateColor() {
  }

  @Test
  public void testCompareRgba() {
  }

  @Test
  public void testCompareVIL() {
  }

  @Test
  public void testComparePixels() {
  }
}