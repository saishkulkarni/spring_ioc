package y;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("jblMusicSystem")
	MusicSystem musicSystem;

	@Override
	public String toString() {
		return "Car [musicSystem=" + musicSystem + "]";
	}

}
