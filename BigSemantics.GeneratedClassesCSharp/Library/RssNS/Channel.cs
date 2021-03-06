//
// Channel.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.RssNS;
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

namespace Ecologylab.Semantics.Generated.Library.RssNS 
{
	[SimplInherit]
	public class Channel : Metadata
	{
		[SimplScalar]
		private MetadataString title;

		[SimplCollection("item")]
		[SimplNoWrap]
		[MmName("items")]
		private List<Item> items;

		public Channel()
		{ }

		public Channel(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString Title
		{
			get{return title;}
			set
			{
				if (this.title != value)
				{
					this.title = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public List<Item> Items
		{
			get{return items;}
			set
			{
				if (this.items != value)
				{
					this.items = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
