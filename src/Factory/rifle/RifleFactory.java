package Factory.rifle;

import Factory.*;

/**
 * Created by admin on 03.05.2017. 123
 */
public class RifleFactory implements WeaponFactory {
    @Override
    public Revolver createRevolver() {
        return null;
    }

    @Override
    public Gun createGun() {
        return null;
    }

    @Override
    public Rifle createRifle() {
        return null;
    }

    @Override
    public Bfg createBfg() {
        return null;
    }
}
