import { Skill } from './skill';
import { PassiveSkill } from './passive-skill';
import { NoblePhantasm } from './noble-phantasm';

export class Servant {
	id: number;
	servantClass: string;
	name: string;
	jpName: string;
	aka: string;
	cost: number;
	stars: number;
	saintGraphUrl: string;
	iconUrl: string;
	minAtk: number;
	maxAtk: number;
	minHp: number;
	maxHp: number;
	grailAtk: number;
	grailHp: number;
	va: string;
	illustrator: string;
	attribute: string;
	growthCurve: string;
	starAbsorption: number;
	starGeneration: number;
	npChargeAtk: number;
	npChargeDef: number;
	deathRate: number;
	alignments: string;
	gender: string;
	traits: string;
	deck: string;
	hits: string;
	ratios: string;
	skills1: Skill[];
	skills2: Skill[];
	skills3: Skill[];

	passiveSkills: PassiveSkill[];

	noblePhantasms: NoblePhantasm[];
}
