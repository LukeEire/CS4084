package ie.ul.studentsavermealhelper;

import android.app.Application;

public class GlobalClass extends Application {
    //Used to keep track of the switch states between activities
    public static boolean vegSwitch = true;
    public static boolean chickenSwitch = true;
    public static boolean porkSwitch = true;
    public static boolean fishSwitch = true;

    //The pic arrays are called based on what is required to be displayed
    private final int[] pics = {
            R.drawable.mexican_pulled_chicken_and_beans,
            R.drawable.sausage_ragu,
            R.drawable.halloumi_flatbreads,
            R.drawable.cheesy_ham_and_broccoli_pasta,
            R.drawable.piri_piri_chicken_with_spicy_rice,
            R.drawable.refried_bean_quesadillas,
            R.drawable.tuna_and_sweetcorn_fish_cakes,
            R.drawable.jumbo_sausage_roll_with_salsa_beans,
            R.drawable.sicilian_style_tuna_lasagne
    };

    private final int[] vegPics = {
            R.drawable.halloumi_flatbreads,
            R.drawable.refried_bean_quesadillas
    };

    private final int[] chickenPics = {
            R.drawable.mexican_pulled_chicken_and_beans,
            R.drawable.piri_piri_chicken_with_spicy_rice
    };

    private final int[] porkPics = {
            R.drawable.sausage_ragu,
            R.drawable.cheesy_ham_and_broccoli_pasta,
            R.drawable.jumbo_sausage_roll_with_salsa_beans
    };

    private final int[] fishPics = {
            R.drawable.tuna_and_sweetcorn_fish_cakes,
            R.drawable.sicilian_style_tuna_lasagne
    };

    //Same applies for recipe names, you call and merge whatever is needed
    private final String [] recipeNames = {
            "Mexican pulled chicken and beans",
            "Sausage Ragu",
            "Halloumi flatbreads",
            "Cheesy ham and broccoli pasta",
            "Piri Piri Chicken with spicy rice",
            "Refried bean quesadillas",
            "Tuna and sweetcorn fish cakes",
            "Jumbo sausage roll with salsa beans",
            "Sicilian-style tuna lasagne"

    };

    private final String [] vegRecipes = {
            "Halloumi flatbreads",
            "Refried bean quesadillas"
    };

    private final String [] chickenRecipes = {
            "Mexican pulled chicken and beans",
            "Piri Piri Chicken with spicy rice"
    };

    private final String [] porkRecipes = {
            "Sausage Ragu",
            "Cheesy ham and broccoli pasta",
            "Jumbo sausage roll with salsa beans"
    };

    private final String [] fishRecipes = {
            "Tuna and sweetcorn fish cakes",
            "Sicilian-style tuna lasagne"

    };

    //Same again for types
    private final String [] recipeTypes = {
            "Chicken",
            "Pork",
            "Vegetarian",
            "Pork",
            "Chicken",
            "Vegetarian",
            "Fish",
            "Pork",
            "Fish"
    };

    private final String [] vegTypes = {
            "Vegetarian",
            "Vegetarian"
    };

    private final String [] chickenTypes = {
            "Chicken",
            "Chicken"
    };

    private final String [] porkTypes = {
            "Pork",
            "Pork",
            "Pork"
    };

    private final String [] fishTypes = {
            "Fish",
            "Fish"
    };

    //Same again for recipe steps
    private final String [] recipeSteps = {
            "STEP 1\nHeat oven to 180C/160C fan/gas 4. Rub the chicken thighs with 2 tbsp of the chipotle paste. Put the rest in a medium bowl with the garlic, tomatoes, onion and some seasoning. Stir to combine, then tip into a large roasting tin. Sit the chicken thighs close together on top of the sauce. Cover with foil and bake for 1 hr.\n\nSTEP 2\nRemove the roasting tin from the oven, add all the beans and stir into the tomato mixture around the chicken. Put back in the oven, uncovered, for 20 mins or until the chicken is tender and the beans are hot.\n\nSTEP 3\nMeanwhile, mix the herbs, lettuce and cucumber with a drizzle of olive oil and set aside.\n\nSTEP 4\nShred the chicken using a knife and fork, and discard the bones. Mix the chicken through the sauce and beans. Serve with the salad, tortilla chips and lime wedges",

            "STEP 1\nHeat 2 tbsp of the oil in a saucepan over a medium heat. Fry the onion with a pinch of salt for 7 mins. Add the garlic, chilli and rosemary, and cook for 1 min more. Tip in the tomatoes and sugar, and simmer for 20 mins.\n\nSTEP 2\nHeat the remaining oil in a medium frying pan over a medium heat. Squeeze the sausagemeat from the skins and fry, breaking it up with a wooden spoon, for 5-7 mins until golden. Add to the sauce with the milk and lemon zest, then simmer for a further 5 mins. To freeze, leave to cool completely and transfer to large freezerproof bags.\n\nSTEP 3\nCook the pasta following pack instructions. Drain and toss with the sauce. Scatter over the parmesan and parsley leaves to serve",

            "STEP 1\nToast the pumpkin seeds with the cumin seeds in a large frying pan until they begin to pop and smell fragrant, then transfer to a large bowl. Add the cabbage, peppers and vinegar, and season well. Mix thoroughly and set aside.\n\nSTEP 2\nHeat oven to low and put the bread in to warm through. Using the pan you used to toast the seeds, fry the halloumi with the olive oil in batches for 3 mins each side until crispy and golden. Transfer to the oven to keep warm.\n\nSTEP 3\nSpread a layer of hummus on each flatbread and top with a handful of slaw, halloumi and rocket to serve",

            "STEP 1\nBring a large pan of water to the boil and cook the pasta following pack instructions, adding the broccoli florets to the pan for the final 4 mins. Drain and set aside.\n\nSTEP 2\nMeanwhile, make the sauce. Heat the oil in a large pan and cook the onion for 5 mins to soften, then stir in the garlic and cook for 1 min more. Stir in the ham, cream and mustard, then bring to the boil. Add the pasta and broccoli, then stir in the cheese, coating everything in the sauce.",

            "STEP 1\nHeat oven to 200C/180C fan/gas 6. Slash each piece of chicken 3 times, so the marinade can really flavour the meat. Pour over the sauce and leave in the fridge to marinate, if you have time. If not, mix well and arrange, skin-side up, in a roasting tin. Cook for 30 mins, then increase heat to 220C/200C fan/gas 7 and cook for about 15 mins more until the skin is crispy and golden.\n\nSTEP 2\nWhen the chicken is almost ready, heat the oil in a frying pan. Cook the peppers and white parts of the spring onions for 5 mins. Tip in the purée and paprika, stir, then add the rice, breaking up with a wooden spoon so all the grains are coated well. Use a high heat and scrape any that sticks off the bottom so you get some soft and some crispy parts. Heat until piping hot. Scatter the green parts of the spring onion on top and serve with the chicken, and some vegetables or salad, if you like.",

            "STEP 1\nHeat the oil in a large frying pan and cook the onion and garlic for 2 mins. Add the cumin and cook for 1 min more. Tip in the beans, paprika and a splash of water. Using a potato masher, break the beans down as they warm through to make a rough purée. Season generously.\n\nSTEP 2\nSpread the refried beans onto 4 of the tortillas and scatter over the cheese and coriander. Spoon over the salsa, then top with the remaining tortillas to make 4 sandwiches. Wipe the frying pan with kitchen paper and return to the heat or heat a griddle pan. Cook each sandwich for 1-2 mins on each side until the tortillas are crisp and golden and the cheese is melting. Serve warm, cut into wedges, with extra salsa and soured cream for dipping.",

            "STEP 1\nCook the potatoes in boiling salted water until really tender. Drain and allow to steam-dry in a colander. Tip into a bowl, season and mash. Stir in the mayonnaise, tuna, sweetcorn and chives or parsley. Shape into 4 cakes and chill until cold and firm.\n\nSTEP 2\nDip each cake into the egg, letting the excess drip off, then coat in the breadcrumbs. Chill for 15 mins.\n\nSTEP 3\nHeat a little of the oil in a pan and gently fry the cakes for 2-3 mins on each side until golden. You may need to do this in batches – keep warm in a low oven. Serve with extra mayonnaise and salad leaves.",

            "STEP 1\n" + "Heat oven to 200C/180C fan/gas 6 and line a baking tray with baking parchment or foil. In a large bowl, mix together the sausagemeat, herbs, half the salsa and roughly half the egg until well combined.\n" + "\n" +
                    "STEP 2\n" +
                    "Unroll the pastry sheet on your baking tray. Pile the sausage mixture onto one side of the pastry – along the longer side – leaving a gap of 4cm around the edge. Brush a little of the egg around the edges, then fold the pastry over the filling. Press the edges together with a fork and score a few air holes through the top with a knife (to let steam escape). Brush with the remaining egg and bake for 40 mins.\n" +
                    "\n" +
                    "STEP 3\n" +
                    "Meanwhile, tip the beans, tomatoes, remaining salsa and some seasoning into a saucepan and cover with a lid. Simmer for 20 mins or until the sauce is thick and clings to the beans. To serve, scatter the beans with the chilli and serve with slices of sausage roll.",

            "STEP 1\n" +
                    "Heat oven to 200C/180C fan/gas 6. Tip the tomatoes, peppers, olives, cinnamon and herbs into a pan, cover and simmer for 10 mins until the tomatoes have broken down a little. Add the tuna and season.\n" +
                    "\n" +
                    "STEP 2\n" +
                    "Tip the cream cheese into a bowl, season and mix to loosen a little, adding a splash of water (or milk, if you have some) to make a thick white-sauce consistency. Assemble the lasagne in a baking dish, approx 20 x 30cm. Pour roughly a third of the tuna sauce into the bottom of the dish, top with 4 lasagne sheets, a third of the cream cheese sauce, then repeat the layers twice more. Scatter over the mozzarella and bake for 35 mins until golden and bubbling."
    };

    private final String [] vegSteps = {
            "STEP 1\nToast the pumpkin seeds with the cumin seeds in a large frying pan until they begin to pop and smell fragrant, then transfer to a large bowl. Add the cabbage, peppers and vinegar, and season well. Mix thoroughly and set aside.\n\nSTEP 2\nHeat oven to low and put the bread in to warm through. Using the pan you used to toast the seeds, fry the halloumi with the olive oil in batches for 3 mins each side until crispy and golden. Transfer to the oven to keep warm.\n\nSTEP 3\nSpread a layer of hummus on each flatbread and top with a handful of slaw, halloumi and rocket to serve",

            "STEP 1\nHeat the oil in a large frying pan and cook the onion and garlic for 2 mins. Add the cumin and cook for 1 min more. Tip in the beans, paprika and a splash of water. Using a potato masher, break the beans down as they warm through to make a rough purée. Season generously.\n\nSTEP 2\nSpread the refried beans onto 4 of the tortillas and scatter over the cheese and coriander. Spoon over the salsa, then top with the remaining tortillas to make 4 sandwiches. Wipe the frying pan with kitchen paper and return to the heat or heat a griddle pan. Cook each sandwich for 1-2 mins on each side until the tortillas are crisp and golden and the cheese is melting. Serve warm, cut into wedges, with extra salsa and soured cream for dipping.",

     };

    private final String [] chickenSteps = {
            "STEP 1\nHeat oven to 180C/160C fan/gas 4. Rub the chicken thighs with 2 tbsp of the chipotle paste. Put the rest in a medium bowl with the garlic, tomatoes, onion and some seasoning. Stir to combine, then tip into a large roasting tin. Sit the chicken thighs close together on top of the sauce. Cover with foil and bake for 1 hr.\n\nSTEP 2\nRemove the roasting tin from the oven, add all the beans and stir into the tomato mixture around the chicken. Put back in the oven, uncovered, for 20 mins or until the chicken is tender and the beans are hot.\n\nSTEP 3\nMeanwhile, mix the herbs, lettuce and cucumber with a drizzle of olive oil and set aside.\n\nSTEP 4\nShred the chicken using a knife and fork, and discard the bones. Mix the chicken through the sauce and beans. Serve with the salad, tortilla chips and lime wedges",

            "STEP 1\nHeat oven to 200C/180C fan/gas 6. Slash each piece of chicken 3 times, so the marinade can really flavour the meat. Pour over the sauce and leave in the fridge to marinate, if you have time. If not, mix well and arrange, skin-side up, in a roasting tin. Cook for 30 mins, then increase heat to 220C/200C fan/gas 7 and cook for about 15 mins more until the skin is crispy and golden.\n\nSTEP 2\nWhen the chicken is almost ready, heat the oil in a frying pan. Cook the peppers and white parts of the spring onions for 5 mins. Tip in the purée and paprika, stir, then add the rice, breaking up with a wooden spoon so all the grains are coated well. Use a high heat and scrape any that sticks off the bottom so you get some soft and some crispy parts. Heat until piping hot. Scatter the green parts of the spring onion on top and serve with the chicken, and some vegetables or salad, if you like.",
    };

    private final String [] porkSteps = {
            "STEP 1\nHeat 2 tbsp of the oil in a saucepan over a medium heat. Fry the onion with a pinch of salt for 7 mins. Add the garlic, chilli and rosemary, and cook for 1 min more. Tip in the tomatoes and sugar, and simmer for 20 mins.\n\nSTEP 2\nHeat the remaining oil in a medium frying pan over a medium heat. Squeeze the sausagemeat from the skins and fry, breaking it up with a wooden spoon, for 5-7 mins until golden. Add to the sauce with the milk and lemon zest, then simmer for a further 5 mins. To freeze, leave to cool completely and transfer to large freezerproof bags.\n\nSTEP 3\nCook the pasta following pack instructions. Drain and toss with the sauce. Scatter over the parmesan and parsley leaves to serve",

            "STEP 1\nBring a large pan of water to the boil and cook the pasta following pack instructions, adding the broccoli florets to the pan for the final 4 mins. Drain and set aside.\n\nSTEP 2\nMeanwhile, make the sauce. Heat the oil in a large pan and cook the onion for 5 mins to soften, then stir in the garlic and cook for 1 min more. Stir in the ham, cream and mustard, then bring to the boil. Add the pasta and broccoli, then stir in the cheese, coating everything in the sauce.",

            "STEP 1\n" +
                    "Heat oven to 200C/180C fan/gas 6 and line a baking tray with baking parchment or foil. In a large bowl, mix together the sausagemeat, herbs, half the salsa and roughly half the egg until well combined.\n" +
                    "\n" +
                    "STEP 2\n" +
                    "Unroll the pastry sheet on your baking tray. Pile the sausage mixture onto one side of the pastry – along the longer side – leaving a gap of 4cm around the edge. Brush a little of the egg around the edges, then fold the pastry over the filling. Press the edges together with a fork and score a few air holes through the top with a knife (to let steam escape). Brush with the remaining egg and bake for 40 mins.\n" +
                    "\n" +
                    "STEP 3\n" +
                    "Meanwhile, tip the beans, tomatoes, remaining salsa and some seasoning into a saucepan and cover with a lid. Simmer for 20 mins or until the sauce is thick and clings to the beans. To serve, scatter the beans with the chilli and serve with slices of sausage roll."
    };

    private final String [] fishSteps = {
            "STEP 1\nCook the potatoes in boiling salted water until really tender. Drain and allow to steam-dry in a colander. Tip into a bowl, season and mash. Stir in the mayonnaise, tuna, sweetcorn and chives or parsley. Shape into 4 cakes and chill until cold and firm.\n\nSTEP 2\nDip each cake into the egg, letting the excess drip off, then coat in the breadcrumbs. Chill for 15 mins.\n\nSTEP 3\nHeat a little of the oil in a pan and gently fry the cakes for 2-3 mins on each side until golden. You may need to do this in batches – keep warm in a low oven. Serve with extra mayonnaise and salad leaves.",

            "STEP 1\n" +
                    "Heat oven to 200C/180C fan/gas 6. Tip the tomatoes, peppers, olives, cinnamon and herbs into a pan, cover and simmer for 10 mins until the tomatoes have broken down a little. Add the tuna and season.\n" +
                    "\n" +
                    "STEP 2\n" +
                    "Tip the cream cheese into a bowl, season and mix to loosen a little, adding a splash of water (or milk, if you have some) to make a thick white-sauce consistency. Assemble the lasagne in a baking dish, approx 20 x 30cm. Pour roughly a third of the tuna sauce into the bottom of the dish, top with 4 lasagne sheets, a third of the cream cheese sauce, then repeat the layers twice more. Scatter over the mozzarella and bake for 35 mins until golden and bubbling."
    };

    //Method used to combine the string arrays as needed
    public String[] combineArrays(String[] a, String[] b){

        String[] combo = new String[a.length + b.length];
        int count = 0;

        for (String value : a) {
            combo[count] = value;
            count++;
        }
        for (String s : b) {
            combo[count] = s;
            count++;
        }
        return combo;
    }
    //Method to combine pic arrays as needed
    public int[] combinePics(int[] a, int[] b){

        int[] combo = new int[a.length + b.length];
        int count = 0;

        for (int value : a) {
            combo[count] = value;
            count++;
        }
        for (int i : b) {
            combo[count] = i;
            count++;
        }
        return combo;
    }

    //Logic behind the switches and what needs to be displayed on the main feed matching all the combos
    //Ive realised since that I could have used a template for this but ive committed now I guess
    public String[] getRecipeNames() {

        if(vegSwitch && chickenSwitch && porkSwitch && fishSwitch){
            return recipeNames;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch){
            return recipeNames;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch){
            return fishRecipes;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return porkRecipes;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            return combineArrays(porkRecipes, fishRecipes);
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return chickenRecipes;
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            return combineArrays(chickenRecipes, fishRecipes);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            return combineArrays(chickenRecipes, porkRecipes);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && fishSwitch) {
            String [] cpf = combineArrays(chickenRecipes, porkRecipes);
            return combineArrays(cpf, fishRecipes);
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch) {
            return vegRecipes;
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch) {
            return combineArrays(vegRecipes, fishRecipes);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return combineArrays(vegRecipes, porkRecipes);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            String[] vpf = combineArrays(vegRecipes,porkRecipes);
            return combineArrays(vpf, fishRecipes);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return combineArrays(vegRecipes, chickenRecipes);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            String[] vcf = combineArrays(vegRecipes, chickenRecipes);
            return combineArrays(vcf, fishRecipes);
        }else if(vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            String[]vcp = combineArrays(vegRecipes, chickenRecipes);
            return combineArrays(vcp, porkRecipes);
        }
        return recipeNames;
    }

    //Same as above
    public String[] getRecipeTypes() {

        if(vegSwitch && chickenSwitch && porkSwitch && fishSwitch){
            return recipeTypes;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch){
            return recipeTypes;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch){
            return fishTypes;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return porkTypes;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            return combineArrays(porkTypes, fishTypes);
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return chickenTypes;
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            return combineArrays(chickenTypes, fishTypes);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && fishSwitch) {
            String [] cpf = combineArrays(chickenTypes, porkTypes);
            return combineArrays(cpf, fishTypes);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            return combineArrays(chickenTypes, porkTypes);
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch) {
            return vegTypes;
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch) {
            return combineArrays(vegTypes, fishTypes);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return combineArrays(vegTypes, porkTypes);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            String[] vpf = combineArrays(vegTypes,porkTypes);
            return combineArrays(vpf, fishTypes);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return combineArrays(vegTypes, chickenTypes);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            String[] vcf = combineArrays(vegTypes, chickenTypes);
            return combineArrays(vcf, fishTypes);
        }else if(vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            String[]vcp = combineArrays(vegTypes, chickenTypes);
            return combineArrays(vcp, porkTypes);
        }

        return recipeTypes;
    }

    //Same as above
    public String[] getRecipeSteps() {

        if(vegSwitch && chickenSwitch && porkSwitch && fishSwitch){
            return recipeSteps;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch){
            return recipeSteps;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch){
            return fishSteps;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return porkSteps;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            return combineArrays(porkSteps, fishSteps);
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return chickenSteps;
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            return combineArrays(chickenSteps, fishSteps);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && fishSwitch) {
            String [] cpf = combineArrays(chickenSteps, porkSteps);
            return combineArrays(cpf, fishSteps);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            return combineArrays(chickenSteps, porkSteps);
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch) {
            return vegSteps;
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch) {
            return combineArrays(vegSteps, fishSteps);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return combineArrays(vegSteps, porkSteps);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            String[] vpf = combineArrays(vegSteps,porkSteps);
            return combineArrays(vpf, fishTypes);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return combineArrays(vegSteps, chickenSteps);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            String[] vcf = combineArrays(vegSteps, chickenSteps);
            return combineArrays(vcf, fishSteps);
        }else if(vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            String[]vcp = combineArrays(vegSteps, chickenSteps);
            return combineArrays(vcp, porkSteps);
        }

        return recipeSteps;
    }
    //Same as above
    public int[] getRecipePics() {

        if(vegSwitch && chickenSwitch && porkSwitch && fishSwitch){
            return pics;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch){
            return pics;
        }else if(!vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch){
            return fishPics;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return porkPics;
        }else if(!vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            return combinePics(porkPics, fishPics);
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return chickenPics;
        }else if(!vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            return combinePics(chickenPics, fishPics);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && fishSwitch) {
            int [] cpf = combinePics(chickenPics, porkPics);
            return combinePics(cpf, fishPics);
        }else if(!vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            return combinePics(chickenPics, porkPics);
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && !fishSwitch) {
            return vegPics;
        }else if(vegSwitch && !chickenSwitch && !porkSwitch && fishSwitch) {
            return combinePics(vegPics, fishPics);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && !fishSwitch) {
            return combinePics(vegPics, porkPics);
        }else if(vegSwitch && !chickenSwitch && porkSwitch && fishSwitch) {
            int[] vpf = combinePics(vegPics,porkPics);
            return combinePics(vpf, fishPics);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && !fishSwitch) {
            return combinePics(vegPics, chickenPics);
        }else if(vegSwitch && chickenSwitch && !porkSwitch && fishSwitch) {
            int[] vcf = combinePics(vegPics, chickenPics);
            return combinePics(vcf, fishPics);
        }else if(vegSwitch && chickenSwitch && porkSwitch && !fishSwitch) {
            int[]vcp = combinePics(vegPics, chickenPics);
            return combinePics(vcp, porkPics);
        }

        return pics;
    }


}
