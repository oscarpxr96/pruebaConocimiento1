package co.com.utest.project.models;

public class DeviceInfoData {

    private String mobileDevice;
    private String model;
    private String operatingSystem;

    public DeviceInfoData(String mobileDevice, String model, String operatingSystem) {
        this.mobileDevice = mobileDevice;
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    public String getMobileDevice() { return mobileDevice; }
    public String getModel() { return model; }
    public String getOperatingSystem() { return operatingSystem; }
}
