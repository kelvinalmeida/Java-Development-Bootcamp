import java.util.ArrayList;

public class MagazineLibrary {
        private ArrayList<Magazine> magazines;

        public MagazineLibrary() {
            magazines = new ArrayList<>();
        }

        public Magazine getMagazine(int index) {
            return new Magazine(magazines.get(index));
        }

        public void setMagazine(Magazine objMagazine, int index) {
            magazines.set(index, new Magazine(objMagazine));
        }

        public void addMagazine(Magazine objMagazine) {
            magazines.add(new Magazine(objMagazine));
        }

}
