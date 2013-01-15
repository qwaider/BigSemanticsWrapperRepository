//
// Rating.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.MiscNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.MiscNS 
{
	[SimplInherit]
	public class Rating : Comment
	{
		[SimplScalar]
		private MetadataString rating;

		public Rating()
		{ }

		public Rating(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString RatingProp
		{
			get{return rating;}
			set
			{
				if (this.rating != value)
				{
					this.rating = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
