package org.vulcan.light.designpattern.creational.builder.example;

/**
 * @author Sam Lu
 * @date 2021/6/10
 */
public interface Builder {

    /**
     * 设置汽车类型
     *
     * @param type
     */
    void setCarType(CarType type);

    /**
     * 设置座位数
     *
     * @param seats
     */
    void setSeats(int seats);

    /**
     * 设置引擎
     *
     * @param engine
     */
    void setEngine(Engine engine);

    /**
     * 设置变速器
     *
     * @param transmission
     */
    void setTransmission(Transmission transmission);

    /**
     * 设置行车仪
     *
     * @param tripComputer
     */
    void setTripComputer(TripComputer tripComputer);

    /**
     * 设置GPS导航
     *
     * @param gpsNavigator
     */
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
