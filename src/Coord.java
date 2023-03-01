public class Coord {
  int x;
  int y;

  Coord(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public boolean compareCoords(Coord other) {
    return this.x == other.x && this.y == other.y;
  }



}
