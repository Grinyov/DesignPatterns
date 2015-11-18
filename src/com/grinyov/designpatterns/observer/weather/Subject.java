package com.grinyov.designpatterns.observer.weather;


public interface Subject {
	public void registerObserver(Observer o); // вызыватся наблюдателеями для регестрации у субъекта
	public void removeObserver(Observer o);	  // вызыватся наблюдателеями для удаления регестрации
	public void notifyObservers();			  // вызыватся для оповещения наблюдателей об изменении
}
