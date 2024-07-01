package com.VestaChrono;

public class sphere extends shape {
    sphere(int dim1){
        super(dim1, -1);
    }

    public double area(){
        return 4 * Math.PI * dim1 * dim1;
    }
    
}
