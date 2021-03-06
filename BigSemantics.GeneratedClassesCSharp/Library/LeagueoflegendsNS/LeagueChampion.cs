//
// LeagueChampion.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.LeagueoflegendsNS;
using Ecologylab.Semantics.Generated.Library.VideoNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.LeagueoflegendsNS 
{
	[SimplInherit]
	public class LeagueChampion : CompoundDocument
	{
		[SimplScalar]
		private MetadataString epithet;

		[SimplCollection("league_ability")]
		[MmName("abilites")]
		private List<LeagueAbility> abilites;

		[SimplCollection("league_relationship_list")]
		[MmName("relationships")]
		private List<LeagueRelationshipList> relationships;

		[SimplComposite]
		[MmName("champion_spotlight")]
		private YoutubeVideo championSpotlight;

		[SimplComposite]
		[MmName("image")]
		private Image image;

		public LeagueChampion()
		{ }

		public LeagueChampion(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Epithet
		{
			get{return epithet;}
			set
			{
				if (this.epithet != value)
				{
					this.epithet = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<LeagueAbility> Abilites
		{
			get{return abilites;}
			set
			{
				if (this.abilites != value)
				{
					this.abilites = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<LeagueRelationshipList> Relationships
		{
			get{return relationships;}
			set
			{
				if (this.relationships != value)
				{
					this.relationships = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public YoutubeVideo ChampionSpotlight
		{
			get{return championSpotlight;}
			set
			{
				if (this.championSpotlight != value)
				{
					this.championSpotlight = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public Image Image
		{
			get{return image;}
			set
			{
				if (this.image != value)
				{
					this.image = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
