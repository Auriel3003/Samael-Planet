package com.example.planeto

object setData {
    fun SetPlanets():List<PlanetData>{
        var Planetlist= mutableListOf<PlanetData>()
        Planetlist.add(
            PlanetData(
                6,
                "Mars",
                "Milkyway Galaxy",
                "227.9",
                "3.721",
                "Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System, being larger than only Mercury. In the English language, Mars is named for the Roman god of war."
            )
        )
        Planetlist.add(
            PlanetData(
                5,
                "Moon",
                "Milkyway Galaxy",
                "150.0",
                "1.62",
                "The Moon is Earth's only natural satellite. Together with Earth it forms the Earth-Moon satellite system. It is about one-quarter of Earth in diameter. In the Solar System it is the fifth largest satellite, larger than any of the known dwarf planets and the largest satellite of a planet relative to the planet."
            )
        )
        Planetlist.add(
            PlanetData(
                10,
                "Neptune",
                "Milkyway Galaxy",
                "4497.1",
                "11.15",
                "Neptune is the eighth planet from the Sun and the farthest known solar planet. In the Solar System, it is the fourth-largest planet by diameter, the third-most-massive planet, and the densest giant planet. It is 17 times the mass of Earth, and slightly more massive than its near-twin Uranus."
            )
        )
        Planetlist.add(
            PlanetData(
                4,
                "Earth",
                "Milkyway Galaxy",
                "149.6",
                "9.807",
                "He Bagha, Ashok Rajaram Sawant yanni itha Jaaga navhti Ghetli. So, SORI."
            )
        )
        Planetlist.add(
            PlanetData(
                3,
                "Venus",
                "Milkyway Galaxy",
                "108.2",
                "8.87",
                "Venus is the second planet from the Sun and is named after the Roman goddess of love and beauty. As the brightest natural object in Earth's night sky after the Moon, Venus can cast shadows and can be visible to the naked eye in broad daylight."
            )
        )
        Planetlist.add(
            PlanetData(
                9,
                "Uranus",
                "Milkyway Galaxy",
                "2871.0",
                "8.87",
                "Uranus is the seventh planet from the Sun. Its name is a reference to the Greek god of the sky, Uranus, who, according to Greek mythology, was the great-grandfather of Ares, grandfather of Zeus and father of Cronus. It has the third-largest planetary radius and fourth-largest planetary mass in the Solar System."
            )
        )
        Planetlist.add(
            PlanetData(
                1,
                "Sun",
                "Milkyway Galaxy",
                "0",
                "274.0",
                "The Sun is the star at the center of the Solar System. It is a nearly perfect ball of hot plasma, heated to incandescence by nuclear fusion reactions in its core, radiating the energy mainly as light, ultraviolet, and infrared radiation. It is the most important source of energy for life on Earth."
            )
        )
        Planetlist.add(
            PlanetData(
                8,
                "Saturn",
                "Milkyway Galaxy",
                "1427.0",
                "10.44",
                "Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius of about nine and a half times that of Earth. It has only one-eighth the average density of Earth; however, with its larger volume, Saturn is over 95 times more massive."
            )
        )
        Planetlist.add(
            PlanetData(
                7,
                "Jupiter",
                "Milkyway Galaxy",
                "778.3",
                "24.79",
                "Jupiter is the fifth planet from the Sun and the largest in the Solar System. It is a gas giant with a mass more than two and a half times that of all the other planets in the Solar System combined, but slightly less than one-thousandth the mass of the Sun."
            )
        )
        Planetlist.add(
            PlanetData(
                2,
                "Mercury",
                "Milkyway Galaxy",
                "57.9",
                "3.7",
                "Mercury is the smallest planet in the Solar System and the closest to the Sun. Its orbit around the Sun takes 87.97 Earth days, the shortest of all the Sun's planets. "
            )
        )
        return Planetlist
    }
}