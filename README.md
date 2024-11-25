# Surface Area and Volume of 3D Shapes

## **Description**
This Java project calculates the surface area and volume of various 3D shapes (Sphere, Cylinder, Cube) using polymorphism. It demonstrates the implementation of an interface, random object generation, and how polymorphism is used to handle multiple shape types dynamically.

---

## **Key Features**
1. Uses a common interface `Shape3DInterface` for defining methods `surfaceArea()` and `volume()`.
2. Implements specific shape classes (`Sphere`, `Cylinder`, `Cube`) that provide shape-specific calculations.
3. Generates 10 random 3D shapes and calculates their surface area and volume.
4. Outputs details about each shape, including dimensions, surface area, and volume.

---

## **How Polymorphism is Used**
1. A single interface (`Shape3DInterface`) defines the contract for all 3D shapes.
2. Multiple classes implement this interface, providing their specific logic for surface area and volume.
3. In the `Main` program, polymorphism allows storing different shape objects (Sphere, Cylinder, Cube) in a single list and calling their methods without knowing their exact type at compile time.

---

## **Formulas**
### **Sphere**
- Surface Area = `4 * π * r²`
- Volume = `(4/3) * π * r³`

### **Cylinder**
- Surface Area = `2 * π * r * (r + h)`
- Volume = `π * r² * h`

### **Cube**
- Surface Area = `6 * a²`
- Volume = `a³`

---

## **Sample Output**
Cube [Side=7,92]
Surface Area: 376,57
Volume: 497,21
-----------------------
Sphere [Radius=4,51]
Surface Area: 255,39
Volume: 383,77
-----------------------
Cube [Side=1,68]
Surface Area: 16,90
Volume: 4,73
-----------------------
Cube [Side=2,94]
Surface Area: 51,86
Volume: 25,41
-----------------------
Sphere [Radius=1,90]
Surface Area: 45,38
Volume: 28,75
-----------------------
Cube [Side=8,49]
Surface Area: 432,48
Volume: 611,96
-----------------------
Cube [Side=6,72]
Surface Area: 271,22
Volume: 303,92
-----------------------
Sphere [Radius=8,04]
Surface Area: 812,13
Volume: 2176,28
-----------------------
Sphere [Radius=3,04]
Surface Area: 116,04
Volume: 117,54
-----------------------
Sphere [Radius=1,09]
Surface Area: 15,04
Volume: 5,49
-----------------------
