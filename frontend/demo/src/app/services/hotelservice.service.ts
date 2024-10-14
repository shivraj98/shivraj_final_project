import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Hotel, ResponseData } from '../interface/reponse';

@Injectable({
  providedIn: 'root'
})
export class HotelserviceService {

hotelUrl="http://localhost:8080/api/hotel"

  constructor(private httpClient:HttpClient) { }


  getAllHotels():Observable<ResponseData>{
    return this.httpClient.get<ResponseData>(this.hotelUrl);
  }
}
