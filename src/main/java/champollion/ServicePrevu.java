package champollion;

public class ServicePrevu {
	// TODO : implémenter cette classe
    public int VolumeCM;
 public int VolumeTD;
 public int VolumeTP;

 public  ServicePrevu(int VolumeCM, int VolumeTD, int VolumeTP){
        this.VolumeCM = VolumeCM;
        this.VolumeTD = VolumeTD;
        this.VolumeTP = VolumeTP;
}
 public void addHeure(int VolumeCM, int VolumeTD, int VolumeTP){
        this.VolumeCM = VolumeCM + this.VolumeCM;
        this.VolumeTD = VolumeTD + this.VolumeTD;
        this.VolumeTP = VolumeTP + this.VolumeTP;
}
}


