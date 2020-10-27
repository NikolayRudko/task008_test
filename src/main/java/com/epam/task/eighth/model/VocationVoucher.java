package com.epam.task.eighth.model;

import java.util.StringJoiner;

public class VocationVoucher extends AbstractTouristVoucher {
    private HotelStar star;
    private boolean breakFast;
    private double seaDistance;

    public VocationVoucher() {
    }

    public VocationVoucher(String id, TransportType transport, double cost, int day, String country, HotelStar star, boolean breakFast, double seaDistance) {
        super(id, transport, cost, day, country);
        this.star = star;
        this.breakFast = breakFast;
        this.seaDistance = seaDistance;
    }

    public HotelStar getStar() {
        return star;
    }

    public void setStar(HotelStar star) {
        this.star = star;
    }

    public boolean isBreakFast() {
        return breakFast;
    }

    public void setBreakFast(boolean breakFast) {
        this.breakFast = breakFast;
    }

    public double getSeaDistance() {
        return seaDistance;
    }

    public void setSeaDistance(double seaDistance) {
        this.seaDistance = seaDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        VocationVoucher that = (VocationVoucher) o;

        if (breakFast != that.breakFast) return false;
        if (Double.compare(that.seaDistance, seaDistance) != 0) return false;
        return star == that.star;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (star != null ? star.hashCode() : 0);
        result = 31 * result + (breakFast ? 1 : 0);
        temp = Double.doubleToLongBits(seaDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", VocationVoucher.class.getSimpleName() + "[", "]")
                .add("star=" + star)
                .add("breakFast=" + breakFast)
                .add("seaDistance=" + seaDistance)
                .toString();
    }
}
