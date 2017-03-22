package org.foobarspam.enumtypes.testing;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;
import org.foobarspam.enumtypes.pesoenplanetas.Planeta;
import org.junit.BeforeClass;
import org.junit.Test;

public class PlanetaTest {

	public static String[] planetas;

	@BeforeClass
	public static void CreacionArrayPlanetasSetup() {
		planetas = new String[8];
		int planetasIncluidos = 0;
		for (Planeta planeta : Planeta.values()) {
			planetas[planeta.ordinal()] = planeta.name();
			planetasIncluidos += 1;
		}
		assertThat(planetasIncluidos).isEqualTo(Planeta.values().length);
	}

	@Test
	public void PlanetaConstructorTest() {
		// voy a asegurarme de que los metodos de los Enum Types
		// se comportan como yo espero
		Planeta planetaMercurio = Planeta.MERCURY;
		Planeta planetaMercurio2 = Planeta.MERCURY;
		assertThat(planetaMercurio).isInstanceOf(Planeta.class);
		assertThat(planetaMercurio.ordinal()).isEqualTo(0);
		assertThat(planetaMercurio.name()).isEqualTo("MERCURY");
		assertThat(Planeta.valueOf(planetaMercurio.name())).isEqualTo(Planeta.MERCURY);
		assertThat(planetaMercurio.compareTo(Planeta.MERCURY)).isEqualTo(0);
		assertThat(planetaMercurio.toString()).isEqualToIgnoringWhitespace("MERCURY");
		assertThat(planetaMercurio.equals(planetaMercurio2)).isEqualTo(true);
		assertThat(Planeta.values()[0]).isEqualTo(planetaMercurio);
	}

	@Test
	public void PlanetaGetMasaTest() {
		Planeta planeta = Planeta.MERCURY;
		assertThat(planeta.getMasa()).isEqualTo(3.303e+23);
	}

	@Test
	public void PlanetaGetRadioTest() {
		Planeta planeta = Planeta.MERCURY;
		assertThat(planeta.getRadio()).isEqualTo(2.4397e+6);
	}

	@Test

	public void PlanetaNamesIteratorTest() {
		for (Planeta planeta : Planeta.values()) {
			assertThat(planeta.name()).isIn(planetas);
		}
	}

	@Test

	public void PesoSuperficieMercurioTest() {
		Planeta planetaMercurio = Planeta.MERCURY;
		double pesoHumano = 175;
		assertEquals(66.107583, planetaMercurio.pesoSuperficie(pesoHumano), 0.001);
	}

	@Test

	public void ArrayPlanetasTerrestresTest() {
		String[] planetasTerrestres = new String[4];
		int planetasIncluidos = 0;
		for (int i = Planeta.MERCURY.ordinal(); i < Planeta.JUPITER.ordinal(); i++) {
			planetasTerrestres[i] = Planeta.values()[i].name();
			planetasIncluidos += 1;
		}

		assertThat(planetasIncluidos).isEqualTo(4);
		for (Planeta planeta : Planeta.getPlanetasTerrestres()) {
			assertThat(planeta.name()).isIn(planetasTerrestres);
		}
	}

	@Test
	public void ArrayGigantesGaseosos() {
		String[] gigantesGaseosos = new String[4];
		int planetasIncluidos = 0;
		byte index = 0;
		for (int i = Planeta.JUPITER.ordinal(); i <= Planeta.NEPTUNE.ordinal(); i++) {
			gigantesGaseosos[index] = Planeta.values()[i].name();
			planetasIncluidos += 1;
			index += 1;
		}
		assertThat(planetasIncluidos).isEqualTo(4);
		
		for (Planeta planeta : Planeta.getGigantesGaseosos()) {
			assertThat(planeta.name()).isIn(gigantesGaseosos);
		}
	}
}
