public double getStandardDeviation(){
    double mean= getAverage();
    double Sum_of_squares=0;
    for (i=0;i<dataSize;i++){
        Sum_of_squares += Math.pow(data[i] - mean,2);
    }
    return Math.sqrt(Sum_of_squares/dataSize);
}

public static double calculateAverage(Dataset[] datasets){
    double sum=0;
    for (Dataset ds : datasets){
        sum += ds.getAverage();
    }
    return sum/datasets.length;
}