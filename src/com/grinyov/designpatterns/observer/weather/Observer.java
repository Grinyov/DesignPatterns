package com.grinyov.designpatterns.observer.weather;

// метод апдейт вызывается когда нужно уведомить обозревателей об изменении
public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
