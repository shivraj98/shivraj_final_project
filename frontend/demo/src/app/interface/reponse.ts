export interface Hotel {
    id: number;
    name: string;
    roomPrice: number;
    imageUrl: string;
    description: number;
    rating: number;
    city: string;
    email: string;
    wifi:string;
    gym:string;
    pool:string;

}

export interface ResponseData {
    data: Hotel[];
    message: string;
}