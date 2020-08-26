import { Effect } from './effect';

export class SkillEffect {
	id: number;
	iconUrl: string;
	target: string;
	effect: Effect;
	valueLvl1: number;
	valueLvl2: number;
	valueLvl3: number;
	valueLvl4: number;
	valueLvl5: number;
	valueLvl6: number;
	valueLvl7: number;
	valueLvl8: number;
	valueLvl9: number;
	valueLvl10: number;
	valueIsPercentage: boolean;
	duration: number;
	stacks: number;
	chance: number;
}
